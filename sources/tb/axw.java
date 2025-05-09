package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.internal.jsbridge.KKVParams;
import com.tmall.android.dai.internal.windvane.WVDaiApiPlugin;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class axw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WALLE_API = "WVDAIHandler";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zww f16065a;
        public final /* synthetic */ HashMap b;

        public a(zww zwwVar, HashMap hashMap) {
            this.f16065a = zwwVar;
            this.b = hashMap;
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                return;
            }
            zww zwwVar = this.f16065a;
            if (zwwVar != null) {
                ((WVDaiApiPlugin.a) zwwVar).a(false, this.b, null, dAIError.toString());
            }
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            zww zwwVar = this.f16065a;
            if (zwwVar != null) {
                ((WVDaiApiPlugin.a) zwwVar).b(true, this.b, (Map) objArr[0], null);
            }
        }
    }

    static {
        t2o.a(1034944652);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("772ca864", new Object[]{str})).booleanValue();
        }
        KKVParams parseStringToKKVParams = KKVParams.parseStringToKKVParams(str);
        if (parseStringToKKVParams == null || TextUtils.isEmpty(parseStringToKKVParams.key)) {
            return true;
        }
        return parseStringToKKVParams.save();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r7, tb.zww r8) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.axw.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "4187913e"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r7
            r7 = 1
            r3[r7] = r8
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            r1 = 0
            java.util.HashMap r2 = tb.mwv.g(r7)     // Catch: all -> 0x0036
            if (r2 == 0) goto L_0x0033
            java.lang.String r3 = "name"
            java.lang.Object r3 = r2.get(r3)     // Catch: all -> 0x0030
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0030
            java.lang.String r4 = "inputData"
            java.lang.Object r4 = r2.get(r4)     // Catch: all -> 0x002e
            java.util.Map r4 = (java.util.Map) r4     // Catch: all -> 0x002e
            goto L_0x0043
        L_0x002e:
            r4 = move-exception
            goto L_0x0039
        L_0x0030:
            r4 = move-exception
            r3 = r1
            goto L_0x0039
        L_0x0033:
            r3 = r1
            r4 = r3
            goto L_0x0043
        L_0x0036:
            r4 = move-exception
            r2 = r1
            r3 = r2
        L_0x0039:
            java.lang.String r5 = "WalleJsEventHandle"
            java.lang.String r6 = r4.getMessage()
            tb.kgh.d(r5, r6, r4)
            r4 = r1
        L_0x0043:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0060
            if (r8 == 0) goto L_0x005f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "参数错误. params="
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.tmall.android.dai.internal.windvane.WVDaiApiPlugin$a r8 = (com.tmall.android.dai.internal.windvane.WVDaiApiPlugin.a) r8
            r8.a(r0, r2, r1, r7)
        L_0x005f:
            return
        L_0x0060:
            tb.axw$a r7 = new tb.axw$a
            r7.<init>(r8, r2)
            com.tmall.android.dai.DAI.runCompute(r3, r4, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.axw.d(java.lang.String, tb.zww):void");
    }

    public static void a(String str, zww zwwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7037bbd4", new Object[]{str, zwwVar});
            return;
        }
        KKVParams parseStringToKKVParams = KKVParams.parseStringToKKVParams(str);
        if (parseStringToKKVParams != null && !TextUtils.isEmpty(parseStringToKKVParams.key)) {
            String str2 = parseStringToKKVParams.get();
            if (zwwVar == null) {
                return;
            }
            if (str2 == null) {
                ((WVDaiApiPlugin.a) zwwVar).a(false, null, null, "get value failed");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("value", str2);
            ((WVDaiApiPlugin.a) zwwVar).b(true, null, hashMap, null);
        } else if (zwwVar != null) {
            ((WVDaiApiPlugin.a) zwwVar).a(false, null, null, "params format error");
        }
    }

    public static boolean b(String str, String str2, zww zwwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35905637", new Object[]{str, str2, zwwVar})).booleanValue();
        }
        lu0.d("DAI", 19999, "handleWVDAIHandleEvent", str, str2, null);
        if (TextUtils.equals("runCompute", str)) {
            d(str2, zwwVar);
            return true;
        } else if (TextUtils.equals("setKKValue", str) || TextUtils.equals("removeKKValue", str)) {
            try {
                c(str2);
            } catch (Throwable th) {
                kgh.d("WalleJsEventHandle", "put failed", th);
            }
            return true;
        } else if (!TextUtils.equals("getKKValue", str)) {
            return false;
        } else {
            try {
                a(str2, zwwVar);
            } catch (Throwable th2) {
                kgh.d("WalleJsEventHandle", "get failed", th2);
            }
            return true;
        }
    }
}
