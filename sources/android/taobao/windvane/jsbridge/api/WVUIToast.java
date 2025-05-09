package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUIToast extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIToast";

    static {
        t2o.a(989856307);
    }

    public static /* synthetic */ Object ipc$super(WVUIToast wVUIToast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVUIToast");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"toast".equals(str)) {
            return false;
        }
        toast(wVCallBackContext, str2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void toast(android.taobao.windvane.jsbridge.WVCallBackContext r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            monitor-enter(r7)
            com.android.alibaba.ip.runtime.IpChange r3 = android.taobao.windvane.jsbridge.api.WVUIToast.$ipChange     // Catch: all -> 0x001a
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x001a
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "5c5bc075"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: all -> 0x001a
            r2[r1] = r7     // Catch: all -> 0x001a
            r2[r0] = r8     // Catch: all -> 0x001a
            r8 = 2
            r2[r8] = r9     // Catch: all -> 0x001a
            r3.ipc$dispatch(r4, r2)     // Catch: all -> 0x001a
            monitor-exit(r7)
            return
        L_0x001a:
            r8 = move-exception
            goto L_0x0091
        L_0x001c:
            android.content.Context r3 = r7.mContext     // Catch: all -> 0x001a
            boolean r3 = tb.itw.d(r3)     // Catch: all -> 0x001a
            if (r3 != 0) goto L_0x0044
            tb.nsw r9 = new tb.nsw     // Catch: all -> 0x001a
            r9.<init>()     // Catch: all -> 0x001a
            java.lang.String r0 = "HY_NO_PERMISSION"
            r9.j(r0)     // Catch: all -> 0x001a
            java.lang.String r0 = "msg"
            java.lang.String r1 = "no permission"
            r9.b(r0, r1)     // Catch: all -> 0x001a
            r8.error(r9)     // Catch: all -> 0x001a
            java.lang.String r8 = "WVUIToast"
            java.lang.String r9 = "no permission"
            tb.v7t.d(r8, r9)     // Catch: all -> 0x001a
            monitor-exit(r7)
            return
        L_0x0044:
            java.lang.String r3 = ""
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: all -> 0x001a
            r5 = 17
            if (r4 != 0) goto L_0x0075
            java.lang.String r4 = "utf-8"
            java.lang.String r9 = java.net.URLDecoder.decode(r9, r4)     // Catch: all -> 0x001a, Exception -> 0x0069
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: all -> 0x001a, Exception -> 0x0069
            r4.<init>(r9)     // Catch: all -> 0x001a, Exception -> 0x0069
            java.lang.String r6 = "message"
            java.lang.String r3 = r4.optString(r6)     // Catch: all -> 0x001a, Exception -> 0x0069
            java.lang.String r6 = "duration"
            int r9 = r4.optInt(r6)     // Catch: all -> 0x001a, Exception -> 0x0069
            goto L_0x0076
        L_0x0069:
            android.content.Context r4 = r7.mContext     // Catch: all -> 0x001a
            android.widget.Toast r9 = android.widget.Toast.makeText(r4, r9, r0)     // Catch: all -> 0x001a
            r9.setGravity(r5, r1, r1)     // Catch: all -> 0x001a
            r9.show()     // Catch: all -> 0x001a
        L_0x0075:
            r9 = 0
        L_0x0076:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x001a
            if (r4 != 0) goto L_0x008c
            if (r9 <= r2) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r0 = r9
        L_0x0080:
            android.content.Context r9 = r7.mContext     // Catch: all -> 0x001a
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r3, r0)     // Catch: all -> 0x001a
            r9.setGravity(r5, r1, r1)     // Catch: all -> 0x001a
            r9.show()     // Catch: all -> 0x001a
        L_0x008c:
            r8.success()     // Catch: all -> 0x001a
            monitor-exit(r7)
            return
        L_0x0091:
            monitor-exit(r7)     // Catch: all -> 0x001a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVUIToast.toast(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
