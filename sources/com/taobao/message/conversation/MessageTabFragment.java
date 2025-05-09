package com.taobao.message.conversation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.aura.INeedContainerCompat;
import com.taobao.message.lab.comfrm.inner2.Container;
import com.taobao.message.lab.comfrm.inner2.INeedContainer;
import com.taobao.message.sp.category.SimpleMessageTabHostV2;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.log.TLog;
import tb.bcq;
import tb.huh;
import tb.i1d;
import tb.nd2;
import tb.ouh;
import tb.q0j;
import tb.snl;
import tb.t2o;
import tb.zoc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageTabFragment extends TBBaseFragment implements BizTagUtil.BizTag, INeedContainer, INeedContainerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MessageTabFragment";
    private long clickTime;
    private FrameLayout contentView;
    private IMessageTabHost mTabHost;
    private zoc meterService;

    static {
        t2o.a(530579459);
        t2o.a(529530975);
        t2o.a(537919616);
        t2o.a(537919538);
        TBErrorViewService.register();
    }

    public MessageTabFragment() {
        TraceUtil.beginSection("msgTabClick");
        TLog.loge(TAG, " new instance");
        TraceUtil.endTrace();
    }

    private void addArgs(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997060f", new Object[]{this, bundle});
            return;
        }
        bundle.putLong("click_tab_time", this.clickTime);
        bundle.putString("ampPageSession", snl.f28161a.i(this).b());
    }

    private IMessageTabHost getEndNode(IMessageTabHost iMessageTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMessageTabHost) ipChange.ipc$dispatch("e04b8b08", new Object[]{this, iMessageTabHost});
        }
        if (iMessageTabHost == null) {
            return null;
        }
        if (iMessageTabHost.getInner() == null) {
            return iMessageTabHost;
        }
        return getEndNode(iMessageTabHost.getInner());
    }

    private void installContextResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2f5b49", new Object[]{this});
            return;
        }
        i1d.a();
        TraceUtil.beginSection("installContextResource");
        bcq.a().f(getActivity(), "taobao_wangxin");
        TraceUtil.endTrace();
    }

    public static /* synthetic */ Object ipc$super(MessageTabFragment messageTabFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/conversation/MessageTabFragment");
        }
    }

    @Override // com.taobao.message.kit.util.BizTagUtil.BizTag
    public int bizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("156e9b08", new Object[]{this})).intValue();
        }
        return nd2.MESSAGE_TAB;
    }

    @Override // com.taobao.message.kit.util.BizTagUtil.BizTag
    public String bizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b850f77b", new Object[]{this});
        }
        return q0j.ERROR_CODE_RECOMMEND_FAIL_EXCEED_MAX_COUNT;
    }

    @Override // com.taobao.message.kit.util.BizTagUtil.BizTag
    public String dxSubBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1be84158", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.INeedContainer
    public Container getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("c9eae533", new Object[]{this});
        }
        IMessageTabHost endNode = getEndNode(this.mTabHost);
        if (endNode instanceof INeedContainer) {
            return ((INeedContainer) endNode).getContainer();
        }
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.aura.INeedContainerCompat
    public <T> T getContainerCompat(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17a9f3c9", new Object[]{this, cls});
        }
        IMessageTabHost endNode = getEndNode(this.mTabHost);
        if (endNode instanceof INeedContainerCompat) {
            return (T) ((INeedContainerCompat) endNode).getContainerCompat(cls);
        }
        return null;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        TraceUtil.beginSection("MsgTabInit");
        TLog.loge(TAG, " MsgTabInit");
        TraceUtil.endTrace();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        TraceUtil.beginSection("onCreate");
        installContextResource();
        ApplicationUtil.setApplication(Globals.getApplication());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        addArgs(arguments);
        this.mTabHost.onArguments(arguments);
        this.mTabHost.onCreate(bundle);
        setUTPageName("Page_MsgCenter");
        TraceUtil.endTrace();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTabHost.onDestroy();
        huh.h().d(this.meterService.h());
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TraceUtil.beginSection("onPause");
        super.onPause();
        this.mTabHost.onPause();
        TraceUtil.endTrace();
    }

    public void setTabClickTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a425b27b", new Object[]{this, new Long(j)});
        } else {
            this.clickTime = j;
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        zoc c = huh.h().c("MessageTab", "firstScreen", new ouh());
        this.meterService = c;
        c.start();
        this.meterService.g("onAttach");
        TraceUtil.beginSection("onAttach");
        SimpleMessageTabHostV2 simpleMessageTabHostV2 = new SimpleMessageTabHostV2();
        this.mTabHost = simpleMessageTabHostV2;
        simpleMessageTabHostV2.onAttach(context);
        TraceUtil.endTrace();
        this.meterService.j("onAttach", true);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.meterService.g("onResume");
        TraceUtil.beginSection("onResume");
        super.onResume();
        this.mTabHost.onResume();
        TraceUtil.endTrace();
        this.meterService.j("onResume", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.meterService.g("onViewCreated");
        TraceUtil.beginSection("onViewCreated");
        this.mTabHost.onViewCreated(view, bundle);
        TraceUtil.endTrace();
        this.meterService.j("onViewCreated", true);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        TraceUtil.beginSection("onCreateView");
        this.meterService.g("onCreateView");
        if (this.contentView == null) {
            FrameLayout frameLayout = new FrameLayout(getActivity());
            this.contentView = frameLayout;
            this.mRootView = frameLayout;
        }
        View onCreateView = this.mTabHost.onCreateView(layoutInflater, this.contentView, bundle);
        if (this.contentView.getChildCount() <= 0) {
            this.contentView.addView(onCreateView, new FrameLayout.LayoutParams(-1, -1));
        } else if (onCreateView != this.contentView.getChildAt(0)) {
            this.contentView.removeAllViews();
            this.contentView.addView(onCreateView, new FrameLayout.LayoutParams(-1, -1));
        }
        TraceUtil.endTrace();
        this.meterService.j("onCreateView", true);
        return this.mRootView;
    }
}
