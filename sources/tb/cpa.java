package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.layer.h5.H5InteractLayer;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cpa extends v7<Object> implements H5InteractLayer.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a f = new a();
    public final H5InteractLayer g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ShortVideoTabMessageObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1813428555) {
                super.J((String) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/layer/h5/H5InteractLayerShortVideoTabAdapter$messageObserver$1");
        }

        @Override // com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver
        public void J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e946b5", new Object[]{this, str});
                return;
            }
            ckf.g(str, vaj.KEY_TAB_ID);
            super.J(str);
            cpa.M(cpa.this, str);
        }
    }

    static {
        t2o.a(689963258);
        t2o.a(689963121);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpa(jmi jmiVar, vv1 vv1Var, yps ypsVar, H5InteractLayer h5InteractLayer) {
        super(jmiVar, vv1Var, ypsVar);
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(ypsVar, "tabBaseInfoManager");
        ckf.g(h5InteractLayer, "h5InteractLayer");
        this.g = h5InteractLayer;
        h5InteractLayer.S0(this);
    }

    public static final /* synthetic */ void M(cpa cpaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f40185", new Object[]{cpaVar, str});
        } else {
            cpaVar.N(str);
        }
    }

    public static /* synthetic */ Object ipc$super(cpa cpaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1544323859) {
            super.A((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 79699924) {
            super.B((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/tabadapter/shortvideo/layer/h5/H5InteractLayerShortVideoTabAdapter");
        }
    }

    @Override // tb.w7, tb.wx1
    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabType");
        super.A(str, str2);
        if (L(str)) {
            O(str);
        }
    }

    @Override // tb.w7, tb.wx1
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        super.B(str);
        if (L(str)) {
            P(str);
        }
    }

    @Override // tb.w7
    public Object F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("392caa4", new Object[]{this});
        }
        return null;
    }

    public final void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534388fd", new Object[]{this, str});
            return;
        }
        List<String> m = j0r.m();
        if (m != null && m.contains(str)) {
            this.g.X0();
        }
    }

    public final void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383f7429", new Object[]{this, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(csp.FIRST_FRAME_RENDER_FINISH_NAME);
        dsp.INSTANCE.a(I(), G(), str, arrayList, this.f, J());
    }

    public final void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6089842", new Object[]{this, str});
        } else {
            dsp.INSTANCE.g(I(), G(), str, this.f, J());
        }
    }

    @Override // com.taobao.tab2interact.core.layer.h5.H5InteractLayer.b
    public void e(H5InteractLayerWebView h5InteractLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd24a08", new Object[]{this, h5InteractLayerWebView});
            return;
        }
        ckf.g(h5InteractLayerWebView, "webView");
        h5InteractLayerWebView.setTag(R.id.h5_interact_layer_tab_base_info_manager_tag, J());
    }
}
