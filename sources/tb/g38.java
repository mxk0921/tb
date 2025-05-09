package tb;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.p36;
import tb.r36;
import tb.xb5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g38 implements i1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public g38() {
        r8l.b();
    }

    @Override // tb.i1c
    public LongSparseArray<mvb> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("8b767bdf", new Object[]{this});
        }
        LongSparseArray<mvb> longSparseArray = new LongSparseArray<>();
        longSparseArray.put(kg6.DX_EVENT_TBHOMEPAGETEXIUADSCROLLEVENT, new kg6());
        longSparseArray.put(qg5.DX_EVENT_COMMIT_AD_EVENT, new qg5());
        return longSparseArray;
    }

    @Override // tb.i1c
    public LongSparseArray<evb> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("ea204466", new Object[]{this});
        }
        LongSparseArray<evb> longSparseArray = new LongSparseArray<>();
        longSparseArray.put(-6834540955644463954L, new sr5());
        longSparseArray.put(tr5.DX_PARSER_TBHOMETEXIUMASKINIT, new tr5());
        longSparseArray.put(pk5.DX_PARSER_GET_ALITRACKID, new pk5());
        return longSparseArray;
    }

    @Override // tb.i1c
    public LongSparseArray<qub> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("c048bc82", new Object[]{this});
        }
        LongSparseArray<qub> longSparseArray = new LongSparseArray<>();
        longSparseArray.put(o36.DXMMADLOTTIEVIEW_MMADLOTTIEVIEW, new o36());
        longSparseArray.put(p36.DXMMCUBEPAGEVIEW_MMCUBEPAGEVIEW, new p36.b());
        longSparseArray.put(r36.DXMMFOLDPAGEVIEW_MMFOLDPAGEVIEW, new r36.b());
        return longSparseArray;
    }

    @Override // tb.i1c
    public LongSparseArray<w8> getAbilities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("aab00eb8", new Object[]{this});
        }
        LongSparseArray<w8> longSparseArray = new LongSparseArray<>();
        longSparseArray.put(xb5.ADDTOCART, new xb5.b());
        return longSparseArray;
    }
}
