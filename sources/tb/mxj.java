package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mxj extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578813990);
    }

    public static /* synthetic */ Object ipc$super(mxj mxjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInnerNavProcessorNodeUriFilterItem0");
    }

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return str.equals("newdetail.taobao.com");
    }

    @Override // tb.env, tb.dnv
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("https") || str.equals("http") || str.equals("")) {
            return true;
        }
        return false;
    }
}
