package com.taobao.detail.rate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.detail.rate.vivid.adapter.RatePopAdapter;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.dii;
import tb.hhn;
import tb.i04;
import tb.ll2;
import tb.msc;
import tb.qrf;
import tb.s2d;
import tb.tep;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0003R\u0014\u0010)\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u0018\u00100\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0018\u00101\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0018\u00102\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/taobao/detail/rate/RatePopFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/alibaba/fastjson/JSONArray;", "list", "", "Ltb/hhn;", "prepareContentList", "(Lcom/alibaba/fastjson/JSONArray;)Ljava/util/List;", "", "position", "item", "Ltb/xhv;", "dealItemClick", "(ILtb/hhn;)V", "closePop", "", PushConstants.CLICK_TYPE, "index", "sendResult", "(Ljava/lang/String;I)V", "content", "Landroid/widget/TextView;", "view", "setContent", "(Ljava/lang/String;Landroid/widget/TextView;)V", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "CLICK_TYPE_BACKGROUND", "Ljava/lang/String;", "CLICK_TYPE_BOTTOM", "CLICK_TYPE_CLOSE", "CLICK_TYPE_ELEMENT", "DEFAULT_POP_ID", "popId", "title", "bottomText", "broadcastName", "", "isOperateClick", "Z", "Landroidx/recyclerview/widget/RecyclerView;", OrderConfigs.RECYCLERVIEW, "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/taobao/detail/rate/vivid/adapter/RatePopAdapter;", "reportAdapter", "Lcom/taobao/detail/rate/vivid/adapter/RatePopAdapter;", "contentList", "Ljava/util/List;", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RatePopFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bottomText;
    private String broadcastName;
    private boolean isOperateClick;
    private String popId;
    private RecyclerView recyclerView;
    private RatePopAdapter reportAdapter;
    private String title;
    private final String CLICK_TYPE_BACKGROUND = "background";
    private final String CLICK_TYPE_BOTTOM = "bottom";
    private final String CLICK_TYPE_CLOSE = "close";
    private final String CLICK_TYPE_ELEMENT = "element";
    private final String DEFAULT_POP_ID = "swift_rate_kit";
    private List<hhn> contentList = yz3.i();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "executeResult");
            if (executeResult.getStatusCode() == 0) {
                ckf.b(executeResult.getType(), "onClose");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RatePopFragment.access$setOperateClick$p(RatePopFragment.this, true);
            RatePopFragment ratePopFragment = RatePopFragment.this;
            RatePopFragment.sendResult$default(ratePopFragment, RatePopFragment.access$getCLICK_TYPE_BACKGROUND$p(ratePopFragment), 0, 2, null);
            RatePopFragment.access$closePop(RatePopFragment.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RatePopFragment.access$setOperateClick$p(RatePopFragment.this, true);
            RatePopFragment ratePopFragment = RatePopFragment.this;
            RatePopFragment.sendResult$default(ratePopFragment, RatePopFragment.access$getCLICK_TYPE_CLOSE$p(ratePopFragment), 0, 2, null);
            RatePopFragment.access$closePop(RatePopFragment.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RatePopFragment.access$setOperateClick$p(RatePopFragment.this, true);
            RatePopFragment ratePopFragment = RatePopFragment.this;
            RatePopFragment.sendResult$default(ratePopFragment, RatePopFragment.access$getCLICK_TYPE_BOTTOM$p(ratePopFragment), 0, 2, null);
            RatePopFragment.access$closePop(RatePopFragment.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            new StringBuilder("Error occurred: ").append(errorResult.getMsg());
        }
    }

    public static final /* synthetic */ void access$closePop(RatePopFragment ratePopFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90d36b2", new Object[]{ratePopFragment});
        } else {
            ratePopFragment.closePop();
        }
    }

    public static final /* synthetic */ void access$dealItemClick(RatePopFragment ratePopFragment, int i, hhn hhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0867b0c", new Object[]{ratePopFragment, new Integer(i), hhnVar});
        } else {
            ratePopFragment.dealItemClick(i, hhnVar);
        }
    }

    public static final /* synthetic */ String access$getCLICK_TYPE_BACKGROUND$p(RatePopFragment ratePopFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b260f3d5", new Object[]{ratePopFragment});
        }
        return ratePopFragment.CLICK_TYPE_BACKGROUND;
    }

    public static final /* synthetic */ String access$getCLICK_TYPE_BOTTOM$p(RatePopFragment ratePopFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48523f38", new Object[]{ratePopFragment});
        }
        return ratePopFragment.CLICK_TYPE_BOTTOM;
    }

    public static final /* synthetic */ String access$getCLICK_TYPE_CLOSE$p(RatePopFragment ratePopFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5dfa0db", new Object[]{ratePopFragment});
        }
        return ratePopFragment.CLICK_TYPE_CLOSE;
    }

    public static final /* synthetic */ boolean access$isOperateClick$p(RatePopFragment ratePopFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56dc41f7", new Object[]{ratePopFragment})).booleanValue();
        }
        return ratePopFragment.isOperateClick;
    }

    public static final /* synthetic */ void access$setOperateClick$p(RatePopFragment ratePopFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46f9389", new Object[]{ratePopFragment, new Boolean(z)});
        } else {
            ratePopFragment.isOperateClick = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void closePop() {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.detail.rate.RatePopFragment.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "98373940"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = r10.popId
            if (r0 == 0) goto L_0x0026
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = r10.DEFAULT_POP_ID
        L_0x0028:
            java.lang.String r1 = "popId"
            r8.put(r1, r0)
            java.lang.String r0 = "bizId"
            java.lang.String r1 = "swift_rate_kit"
            r8.put(r0, r1)
            com.alibaba.ability.hub.AbilityHubAdapter r4 = new com.alibaba.ability.hub.AbilityHubAdapter
            tb.zq r0 = new tb.zq
            java.lang.String r2 = "xrate"
            r0.<init>(r1, r2)
            android.content.Context r1 = r10.getContext()
            tb.ldb r0 = r0.a(r1)
            r4.<init>(r0)
            tb.xq r7 = new tb.xq
            r7.<init>()
            com.taobao.detail.rate.RatePopFragment$a r9 = new com.taobao.detail.rate.RatePopFragment$a
            r9.<init>()
            java.lang.String r5 = "stdPop"
            java.lang.String r6 = "close"
            r4.j(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.RatePopFragment.closePop():void");
    }

    private final void dealItemClick(int i, hhn hhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cc01a", new Object[]{this, new Integer(i), hhnVar});
            return;
        }
        sendResult(this.CLICK_TYPE_ELEMENT, i);
        if (hhnVar.c()) {
            closePop();
        }
    }

    public static /* synthetic */ Object ipc$super(RatePopFragment ratePopFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/detail/rate/RatePopFragment");
        }
    }

    private final void sendResult(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51da1f2d", new Object[]{this, str, new Integer(i)});
            return;
        }
        String str2 = this.broadcastName;
        if (str2 != null) {
            dii c2 = dii.c();
            ckf.f(c2, "MegaBroadcast.createInstance()");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PushConstants.CLICK_TYPE, (Object) str);
            jSONObject.put("index", (Object) Integer.valueOf(i));
            ll2 a2 = ll2.a(str2);
            if (a2 != null) {
                a2.f23391a = "__APP__";
                a2.c = jSONObject;
            } else {
                a2 = null;
            }
            if (a2 != null) {
                c2.d(a2, new f());
            }
        }
    }

    public static /* synthetic */ void sendResult$default(RatePopFragment ratePopFragment, String str, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a087e1", new Object[]{ratePopFragment, str, new Integer(i), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        ratePopFragment.sendResult(str, i);
    }

    private final void setContent(String str, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f6da3c", new Object[]{this, str, textView});
        } else if (str != null) {
            textView.setText(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        JSONArray jSONArray = null;
        if (arguments != null) {
            this.popId = arguments.getString("popId");
            this.title = arguments.getString("title");
            this.bottomText = arguments.getString("bottomText");
            this.broadcastName = arguments.getString("broadcastName");
            Serializable serializable = arguments.getSerializable(tep.KEY_UNIFORM_RESULT);
            if (serializable instanceof JSONArray) {
                jSONArray = serializable;
            }
            jSONArray = jSONArray;
        }
        this.contentList = prepareContentList(jSONArray);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.rate_pop_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!this.isOperateClick) {
            sendResult$default(this, this.CLICK_TYPE_BACKGROUND, 0, 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        ckf.g(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.rate_pop_root);
        if (findViewById != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.rate_pop_container);
            if (findViewById2 != null) {
                LinearLayout linearLayout = (LinearLayout) findViewById2;
                View findViewById3 = view.findViewById(R.id.rate_pop_title);
                if (findViewById3 != null) {
                    TextView textView = (TextView) findViewById3;
                    View findViewById4 = view.findViewById(R.id.rate_pop_bottom_button);
                    if (findViewById4 != null) {
                        TextView textView2 = (TextView) findViewById4;
                        View findViewById5 = view.findViewById(R.id.rate_pop_close);
                        if (findViewById5 != null) {
                            FrameLayout frameLayout2 = (FrameLayout) findViewById5;
                            setContent(this.title, textView);
                            setContent(this.bottomText, textView2);
                            View findViewById6 = view.findViewById(R.id.rate_pop_rv);
                            if (findViewById6 != null) {
                                this.recyclerView = (RecyclerView) findViewById6;
                                this.reportAdapter = new RatePopAdapter(this.contentList, new RatePopFragment$onViewCreated$1(this));
                                RecyclerView recyclerView = this.recyclerView;
                                if (recyclerView != null) {
                                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                                    RecyclerView recyclerView2 = this.recyclerView;
                                    if (recyclerView2 != null) {
                                        RatePopAdapter ratePopAdapter = this.reportAdapter;
                                        if (ratePopAdapter != null) {
                                            recyclerView2.setAdapter(ratePopAdapter);
                                            linearLayout.setOnClickListener(b.INSTANCE);
                                            frameLayout.setOnClickListener(new c());
                                            frameLayout2.setOnClickListener(new d());
                                            textView2.setOnClickListener(new e());
                                            return;
                                        }
                                        ckf.y("reportAdapter");
                                        throw null;
                                    }
                                    ckf.y(OrderConfigs.RECYCLERVIEW);
                                    throw null;
                                }
                                ckf.y(OrderConfigs.RECYCLERVIEW);
                                throw null;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    private final List<hhn> prepareContentList(JSONArray jSONArray) {
        hhn hhnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ee3e3988", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return yz3.i();
        }
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String m = qrf.m(jSONObject, "text", "");
                ckf.f(m, "JSONUtil.getString(jsonObject, \"text\", \"\")");
                String m2 = qrf.m(jSONObject, "imageUrl", "");
                ckf.f(m2, "JSONUtil.getString(jsonObject, \"imageUrl\", \"\")");
                hhnVar = new hhn(m, m2, qrf.b(jSONObject, "isAutoClose", false));
            } else {
                hhnVar = null;
            }
            arrayList.add(hhnVar);
        }
        return i04.X(arrayList);
    }
}
