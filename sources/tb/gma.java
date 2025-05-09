package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gma extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578813973);
    }

    public static /* synthetic */ Object ipc$super(gma gmaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/allspark/GuangGuangNavProcessorNodeUriFilterItem4");
    }

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("market.m.taobao.com") || str.equals("market.wapa.taobao.com")) {
            return true;
        }
        return false;
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("/app/tb-source-app/video-fullpage/pages/index2") || str.equals("/app/mtb/personal-homepage/pages/index/index.html") || str.equals(ufs.H5_CONTENT_DETAIL_PATH)) {
            return true;
        }
        return false;
    }
}
