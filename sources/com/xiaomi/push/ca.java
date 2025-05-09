package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.cg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ca extends cc {
    public ca(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static ca a(Context context, String str, int i) {
        b.b("delete  messages when db size is too bigger");
        String a2 = cg.a(context).m548a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("rowDataId in (select ");
        sb.append("rowDataId from " + a2);
        sb.append(" order by createTimeStamp asc limit ?)");
        return new ca(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    private void a(long j) {
        String[] strArr = ((cg.d) this).f800a;
        if (strArr != null && strArr.length > 0) {
            strArr[0] = String.valueOf(j);
        }
    }

    @Override // com.xiaomi.push.cg.a
    public void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a2 = cm.a(m550a());
            long j = by.f781a;
            if (a2 > j) {
                long j2 = (long) ((((a2 - j) * 1.2d) / j) * longValue);
                a(j2);
                bu a3 = bu.a(context);
                a3.a("begin delete " + j2 + "noUpload messages , because db size is " + a2 + "B");
                super.a(context, obj);
                return;
            }
            b.b("db size is suitable");
        }
    }
}
