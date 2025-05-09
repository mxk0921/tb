package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import org.android.agoo.common.AgooConstants;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", AgooConstants.MESSAGE_BODY, "transaction", "(Landroid/database/sqlite/SQLiteDatabase;ZLtb/g1a;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SQLiteDatabaseKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, g1a<? super SQLiteDatabase, ? extends T> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("39dd0176", new Object[]{sQLiteDatabase, new Boolean(z), g1aVar});
        }
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T t = (T) g1aVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e343a32", new Object[]{sQLiteDatabase, new Boolean(z), g1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = g1aVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
