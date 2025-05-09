package com.taobao.mytaobao.aura;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.aura.Container;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.HashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.h9z;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/taobao/mytaobao/aura/AuraFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/widget/FrameLayout;", "contentView", "Ltb/xhv;", "renderAura", "(Landroid/widget/FrameLayout;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onResume", "Lcom/taobao/message/lab/comfrm/aura/Container;", "registerService", "(Lcom/taobao/message/lab/comfrm/aura/Container;)V", "auraContainer", "Lcom/taobao/message/lab/comfrm/aura/Container;", "", "isFirst", "Z", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AuraFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private Container auraContainer;
    private boolean isFirst = true;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Event build = new Event.Build("onSystemConfigurationsChanged").build();
            Container access$getAuraContainer$p = AuraFragment.access$getAuraContainer$p(AuraFragment.this);
            if (access$getAuraContainer$p != null) {
                access$getAuraContainer$p.postEvent(build);
            }
        }
    }

    static {
        t2o.a(745537549);
    }

    public static final /* synthetic */ Container access$getAuraContainer$p(AuraFragment auraFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("f02cff15", new Object[]{auraFragment});
        }
        return auraFragment.auraContainer;
    }

    public static final /* synthetic */ void access$setAuraContainer$p(AuraFragment auraFragment, Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e7b73d", new Object[]{auraFragment, container});
        } else {
            auraFragment.auraContainer = container;
        }
    }

    public static /* synthetic */ Object ipc$super(AuraFragment auraFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/aura/AuraFragment");
        }
    }

    private final void renderAura(FrameLayout frameLayout) {
        String string;
        Bundle arguments;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907adba3", new Object[]{this, frameLayout});
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE)) != null && (arguments = getArguments()) != null && (string2 = arguments.getString("dxEngineBiz")) != null) {
            String str = Login.getNick() + Login.getUserId();
            Bundle arguments3 = getArguments();
            Object obj = arguments3 != null ? arguments3.get("props") : null;
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            this.auraContainer = new Container(requireActivity(), string, null, str, jSONObject);
            WidgetRenderImpl.RenderConfig renderConfig = new WidgetRenderImpl.RenderConfig();
            renderConfig.dxEngineBizType = string2;
            renderConfig.reUseKey = string2;
            Container container = this.auraContainer;
            if (container != null) {
                container.setRenderConfig(renderConfig);
                Container container2 = this.auraContainer;
                if (container2 != null) {
                    registerService(container2);
                    Container container3 = this.auraContainer;
                    if (container3 != null) {
                        container3.postEvent(new Event.Build(StdActions.PAUSE_RENDER).build());
                        Container container4 = this.auraContainer;
                        if (container4 != null) {
                            container4.start(frameLayout);
                        } else {
                            ckf.s();
                            throw null;
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.h(layoutInflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        renderAura(frameLayout);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        Container container = this.auraContainer;
        if (container != null) {
            container.postEvent(new Event.Build("onDisappear").build());
        }
        Container container2 = this.auraContainer;
        if (container2 != null) {
            container2.dispose();
        }
        this.auraContainer = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void registerService(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1485a1", new Object[]{this, container});
        } else {
            ckf.h(container, "container");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Event build = new Event.Build(h9z.EVENT_ON_APPEAR).build();
        Container container = this.auraContainer;
        if (container != null) {
            container.postEvent(build);
        }
        if (this.isFirst) {
            this.isFirst = false;
            View view = getView();
            if (view != null) {
                view.postDelayed(new a(), 100L);
            }
        }
    }
}
