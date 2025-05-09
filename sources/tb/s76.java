package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.weex.utils.tools.TimeCalculator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27841a;
        public long b;
        public String c;
        public long d;

        static {
            t2o.a(444596906);
        }

        public a(String str, long j, String str2, long j2) {
            this.f27841a = str;
            this.b = j;
            this.c = str2;
            this.d = j2;
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0113 A[Catch: IOException -> 0x010f, TRY_LEAVE, TryCatch #3 {IOException -> 0x010f, blocks: (B:59:0x010b, B:63:0x0113), top: B:67:0x010b }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(java.lang.String r8) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.s76.a.a(java.lang.String):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(yh6.CONFIG_KEY_TEMPLATE_NAME, (Object) this.c);
            jSONObject.put("templateVersion", (Object) Long.valueOf(this.d));
            jSONObject.put("consumeTime", (Object) Long.valueOf(this.b));
            jSONObject.put("protocolV", (Object) 1);
            jSONObject.put("perfName", (Object) this.f27841a);
            jSONObject.put("name", (Object) this.f27841a);
            jSONObject.put("platform", (Object) TimeCalculator.PLATFORM_ANDROID);
            if (!TextUtils.isEmpty(s76.a())) {
                jSONObject.put("sdkVersion", (Object) s76.a());
            } else {
                jSONObject.put("sdkVersion", (Object) "4.1.35.3");
            }
            IpChange ipChange2 = h36.$ipChange;
            String jSONString = jSONObject.toJSONString();
            h36.l(jSONString);
            a(jSONString);
        }
    }

    static {
        t2o.a(444596905);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return null;
    }

    public static void b(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe69297", new Object[]{str, new Long(j), dXTemplateItem});
        }
    }
}
