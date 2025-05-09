package com.taobao.calendar.aidl.business.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.uc.webview.export.extension.UCCore;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            try {
                this.mIsInitializing = true;
                if (sQLiteDatabase2 == null) {
                    String str = this.mName;
                    if (str == null) {
                        sQLiteDatabase2 = SQLiteDatabase.create(null);
                    } else {
                        this.mContext.getDatabasePath(str);
                        String path = this.mContext.getDatabasePath(this.mName).getPath();
                        try {
                            try {
                                sQLiteDatabase2 = this.mContext.openOrCreateDatabase(this.mName, this.mEnableWriteAheadLogging ? UCCore.VERIFY_POLICY_PAK_QUICK : 0, this.mFactory);
                            } catch (Exception unused) {
                                sQLiteDatabase2 = SQLiteDatabase.openDatabase(path, this.mFactory, 268435472, this.mErrorHandler);
                            }
                        } catch (SQLiteException e) {
                            if (!z) {
                                String str2 = TAG;
                                Log.e(str2, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                                sQLiteDatabase2 = SQLiteDatabase.openDatabase(path, this.mFactory, 1, this.mErrorHandler);
                            } else {
                                throw e;
                            }
                        }
                    }
                }
                onConfigure(sQLiteDatabase2);
                int version = sQLiteDatabase2.getVersion();
                String str3 = TAG;
                Log.e(str3, "oldversion =" + version + "newVersion =" + this.mNewVersion);
                if (version != this.mNewVersion) {
                    if (!sQLiteDatabase2.isReadOnly()) {
                        sQLiteDatabase2.beginTransaction();
                        if (version == 0) {
                            onCreate(sQLiteDatabase2);
                        } else {
                            int i = this.mNewVersion;
                            if (version > i) {
                                onDowngrade(sQLiteDatabase2, version, i);
                            } else {
                                onUpgrade(sQLiteDatabase2, version, i);
                            }
                        }
                        sQLiteDatabase2.setVersion(this.mNewVersion);
                        sQLiteDatabase2.setTransactionSuccessful();
                        sQLiteDatabase2.endTransaction();
                    } else {
                        throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase2.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
                    }
                }
                onOpen(sQLiteDatabase2);
                if (sQLiteDatabase2.isReadOnly()) {
                    StringBuilder sb = new StringBuilder("Opened ");
                    sb.append(this.mName);
                    sb.append(" in read-only mode");
                }
                this.mDatabase = sQLiteDatabase2;
                this.mIsInitializing = false;
                return sQLiteDatabase2;
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.mDatabase)) {
                    sQLiteDatabase2.close();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("getDatabase called recursively");
        }
    }

    public synchronized void close() {
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            try {
                if (this.mEnableWriteAheadLogging != z) {
                    SQLiteDatabase sQLiteDatabase = this.mDatabase;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                        if (z) {
                            this.mDatabase.enableWriteAheadLogging();
                        } else {
                            this.mDatabase.disableWriteAheadLogging();
                        }
                    }
                    this.mEnableWriteAheadLogging = z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i >= 1) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i);
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }
}
