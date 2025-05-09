package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vwh extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814189);
    }

    public static /* synthetic */ Object ipc$super(vwh vwhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSPagePreprocessorNodeUriFilterItem0");
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        if (str.contains("/app/asr-pages/") || str.contains("/search_rec/")) {
            return true;
        }
        return false;
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
        return str.equals("market.m.taobao.com") || str.equals("market.wapa.taobao.com") || str.equals("mo.m.taobao.com") || str.equals("pre-mo.m.taobao.com");
    }
}
