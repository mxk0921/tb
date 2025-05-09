package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.dynamicFeature.model.AURADynamicFeatureBundleType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ci {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17067a;
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17068a = "";
        public String b = "";
        public String c = AURADynamicFeatureBundleType.AAR;

        static {
            t2o.a(79691871);
        }

        public ci a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ci) ipChange.ipc$dispatch("d7bdd153", new Object[]{this});
            }
            return new ci(this.f17068a, this.b, this.c);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3733e591", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("-")) {
                    str.replace("-", "_");
                }
                this.f17068a = str;
            }
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("622b0222", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.c = str;
            }
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6be94308", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.b = str;
            }
            return this;
        }
    }

    static {
        t2o.a(79691869);
    }

    public static boolean a(ci ciVar, ci ciVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6401c059", new Object[]{ciVar, ciVar2})).booleanValue();
        }
        if (ciVar == null || ciVar2 == null) {
            return false;
        }
        return TextUtils.equals(ciVar.d, ciVar2.d);
    }

    public static boolean b(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bea8d04f", new Object[]{ciVar})).booleanValue();
        }
        if (ciVar == null || TextUtils.isEmpty(ciVar.f17067a) || TextUtils.isEmpty(ciVar.b) || TextUtils.isEmpty(ciVar.c) || TextUtils.isEmpty(ciVar.d)) {
            return false;
        }
        return true;
    }

    public ci(String str, String str2, String str3) {
        this.f17067a = str;
        this.b = str2;
        this.c = str3;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str3);
        this.d = stringBuffer.toString();
    }
}
