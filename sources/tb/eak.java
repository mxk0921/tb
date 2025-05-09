package tb;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eak implements izb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(147849239);
        t2o.a(147849225);
    }

    @Override // tb.izb
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{this, context});
        }
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str = query.getString(query.getColumnIndex("device_ids_grndid"));
            }
            query.close();
        }
        return str;
    }
}
