package tb;

import android.content.ContentValues;
import com.alibaba.ut.abtest.internal.database.ABDataObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class l<T extends ABDataObject> extends bt1<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544347);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 41799062) {
            return new Integer(lVar.a((String) objArr[0], (String[]) objArr[1]));
        }
        if (hashCode == 190871234) {
            return lVar.j((String[]) objArr[0], (String) objArr[1], (String[]) objArr[2]);
        }
        if (hashCode == 1874716821) {
            return lVar.h((String[]) objArr[0], (String) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (String) objArr[4], (String[]) objArr[5]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/ut/abtest/internal/database/ABBaseDao");
    }

    @Override // tb.bt1
    public bu6 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bu6) ipChange.ipc$dispatch("aa2daae3", new Object[]{this});
        }
        return o.L();
    }

    public long[] k(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("4df5f8cb", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (T t : list) {
                ContentValues contentValues = t.toContentValues();
                contentValues.put("create_time", Long.valueOf(currentTimeMillis));
                contentValues.put(ABDataObject.COLUMN_MODIFIED_TIME, Long.valueOf(currentTimeMillis));
                contentValues.put("owner_id", n.j().o());
                arrayList.add(contentValues);
            }
        }
        return b().A(c(), 5, arrayList);
    }
}
