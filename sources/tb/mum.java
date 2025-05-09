package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.preposefilter.perf.OriginPreposeFilterBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mum extends lum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793754);
    }

    public mum(boolean z) {
        super(z);
    }

    public static /* synthetic */ Object ipc$super(mum mumVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/preposefilter/PreposeFilterParser2");
    }

    @Override // tb.lum, tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_prepose_filter_new";
    }

    @Override // tb.lum
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e1c0b96", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* renamed from: w */
    public OriginPreposeFilterBean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OriginPreposeFilterBean) ipChange.ipc$dispatch("61b4b369", new Object[]{this});
        }
        return new OriginPreposeFilterBean();
    }
}
