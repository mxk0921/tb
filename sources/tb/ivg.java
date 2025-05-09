package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ivg extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814010);
    }

    public static /* synthetic */ Object ipc$super(ivg ivgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/LiteCreatorNavProcessorNodeUriFilterItem1");
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        return str.contains("/app/mtb-guang/production/litecreator");
    }

    @Override // tb.env, tb.dnv
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("https") || str.equals("http")) {
            return true;
        }
        return false;
    }

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return str.equals("web.m.taobao.com") || str.equals("web.wapa.taobao.com");
    }
}
