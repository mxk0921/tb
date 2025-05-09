package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sbv extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578813956);
    }

    public sbv() {
        addQueryFilter("wh_weex");
        addQueryFilter(uyv.WX_TPL);
        addQueryFilter("_wx_devtool");
        addQueryFilter("_wx_f_");
        addQueryFilter("tradeHybrid");
    }

    public static /* synthetic */ Object ipc$super(sbv sbvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/management/UltronTradeHybridNavProcessorNodeUriFilterItem0");
    }

    @Override // tb.env, tb.dnv
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("http") || str.equals("https")) {
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
        return str.equals("meta.m.taobao.com") || str.equals("meta.wapa.taobao.com");
    }
}
