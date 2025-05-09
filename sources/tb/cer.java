package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cer extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814003);
    }

    public static /* synthetic */ Object ipc$super(cer cerVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/TBHDNavProcessorNodeUriFilterItem3");
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        if (str.startsWith("/wow/z/hdwk/hd25spring") || str.startsWith("/wow/z/petgame")) {
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
        return str.equals(kyt.TMCS_PAY_SUCCESS_HOST) || str.equals("pre-pages.tmall.com") || str.equals("pages-fast.m.taobao.com") || str.equals(wht.TCC_PAY_SUCCESS_HOST_PRE) || str.equals("huodong.taobao.com") || str.equals("pre-wormhole.taobao.com");
    }
}
