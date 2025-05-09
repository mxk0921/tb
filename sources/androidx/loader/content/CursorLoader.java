package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.Loader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CancellationSignal mCancellationSignal;
    public Cursor mCursor;
    public final Loader<Cursor>.ForceLoadContentObserver mObserver = new Loader.ForceLoadContentObserver();
    public String[] mProjection;
    public String mSelection;
    public String[] mSelectionArgs;
    public String mSortOrder;
    public Uri mUri;

    public CursorLoader(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CursorLoader cursorLoader, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 18860229:
                super.deliverResult((CursorLoader) objArr[0]);
                return null;
            case 179534607:
                super.dump((String) objArr[0], (FileDescriptor) objArr[1], (PrintWriter) objArr[2], (String[]) objArr[3]);
                return null;
            case 557049306:
                super.cancelLoadInBackground();
                return null;
            case 1991810871:
                super.onReset();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/loader/content/CursorLoader");
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2133e5da", new Object[]{this});
            return;
        }
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.mCancellationSignal;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.mUri);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.mProjection));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.mSelection);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.mSelectionArgs));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.mSortOrder);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.mCursor);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    public String[] getProjection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d4ec351b", new Object[]{this});
        }
        return this.mProjection;
    }

    public String getSelection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39d08de3", new Object[]{this});
        }
        return this.mSelection;
    }

    public String[] getSelectionArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f8b20129", new Object[]{this});
        }
        return this.mSelectionArgs;
    }

    public String getSortOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f259ad9f", new Object[]{this});
        }
        return this.mSortOrder;
    }

    public Uri getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
        }
        return this.mUri;
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        super.onReset();
        onStopLoading();
        Cursor cursor = this.mCursor;
        if (cursor != null && !cursor.isClosed()) {
            this.mCursor.close();
        }
        this.mCursor = null;
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5bce00", new Object[]{this});
            return;
        }
        Cursor cursor = this.mCursor;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.mCursor == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f04a282", new Object[]{this});
        } else {
            cancelLoad();
        }
    }

    public void setProjection(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1895b1c7", new Object[]{this, strArr});
        } else {
            this.mProjection = strArr;
        }
    }

    public void setSelection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827eea5b", new Object[]{this, str});
        } else {
            this.mSelection = str;
        }
    }

    public void setSelectionArgs(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e5a11", new Object[]{this, strArr});
        } else {
            this.mSelectionArgs = strArr;
        }
    }

    public void setSortOrder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db19c21f", new Object[]{this, str});
        } else {
            this.mSortOrder = str;
        }
    }

    public void setUri(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc764036", new Object[]{this, uri});
        } else {
            this.mUri = uri;
        }
    }

    public void deliverResult(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf36ec8e", new Object[]{this, cursor});
        } else if (!isReset()) {
            Cursor cursor2 = this.mCursor;
            this.mCursor = cursor;
            if (isStarted()) {
                super.deliverResult((CursorLoader) cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public Cursor loadInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("99f7acc7", new Object[]{this});
        }
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.mCancellationSignal = new CancellationSignal();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor query = ContentResolverCompat.query(getContext().getContentResolver(), this.mUri, this.mProjection, this.mSelection, this.mSelectionArgs, this.mSortOrder, this.mCancellationSignal);
            if (query != null) {
                try {
                    query.getCount();
                    query.registerContentObserver(this.mObserver);
                } catch (RuntimeException e) {
                    query.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.mCancellationSignal = null;
            }
            return query;
        } catch (Throwable th) {
            synchronized (this) {
                this.mCancellationSignal = null;
                throw th;
            }
        }
    }

    public void onCanceled(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839e5e58", new Object[]{this, cursor});
        } else if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public CursorLoader(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.mUri = uri;
        this.mProjection = strArr;
        this.mSelection = str;
        this.mSelectionArgs = strArr2;
        this.mSortOrder = str2;
    }
}
