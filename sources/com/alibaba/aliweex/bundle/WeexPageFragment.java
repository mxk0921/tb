package com.alibaba.aliweex.bundle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.view.WXScrollView;
import com.taobao.weex.utils.WXExceptionUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.c2i;
import tb.cpv;
import tb.cvw;
import tb.d2i;
import tb.d97;
import tb.e2i;
import tb.e97;
import tb.f2i;
import tb.fzc;
import tb.g2i;
import tb.gbe;
import tb.j2v;
import tb.kr0;
import tb.n7x;
import tb.s58;
import tb.t2o;
import tb.u0o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WeexPageFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WeexPageFragment";
    public static final String WX_RENDER_STRATEGY = "render_strategy";
    private c2i mDynamicUrlPresenter;
    private d2i mErrorView;
    private Boolean mFullScreen;
    private cvw mNavBarAdapter;
    private boolean mNoAnimated;
    private n7x mProgressBarView;
    private BroadcastReceiver mRefreshReceiver;
    private BroadcastReceiver mReloadReceiver;
    private b mRenderListener;
    private e2i mRenderPresenter;
    private FrameLayout mRootView;
    private f2i mUTPresenter;
    private g2i mUrlValidate;
    public static String FRAGMENT_TAG = "weex_page";
    @Deprecated
    public static String FRAGMENT_ARG_URI = "arg_uri";
    public static String FRAGMENT_ARG_TAG = "arg_tag";
    public static String FRAGMENT_ARG_BUNDLE_URL = "arg_bundle_url";
    public static String FRAGMENT_ARG_RENDER_URL = "arg_render_url";
    public static String FRAGMENT_ARG_TEMPLATE = "arg_template";
    public static String FRAGMENT_ARG_CUSTOM_OPT = "arg_custom_opt";
    public static String FRAGMENT_ARG_INIT_DATA = "arg_init_data";
    public static String FRAGMENT_ARG_FROM_ACTIVITY = "arg_from_activity";
    public String mFtag = FRAGMENT_TAG;
    private boolean mUTEnable = true;
    private boolean mDyUrlEnable = false;
    private boolean mEnableUnicornWeexRender = false;
    private fzc.a mOnBackPressedListener = null;
    private RenderContainer mRenderContainer = null;
    private boolean mIsHeron = false;
    public com.alibaba.aliweex.bundle.a mWXRenderListener = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1997000981) {
                super.onException((WXSDKInstance) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            } else if (hashCode == -1632936177) {
                super.onViewCreated((WXSDKInstance) objArr[0], (View) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/aliweex/bundle/WeexPageFragment$1");
            }
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            super.onException(wXSDKInstance, str, str2);
            WeexPageFragment.this.onWXException(wXSDKInstance, str, str2);
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            super.onViewCreated(wXSDKInstance, view);
            WeexPageFragment.this.onWXViewCreated(wXSDKInstance, view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(85983289);
            t2o.a(985661443);
        }

        public boolean needWrapper() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae2c8d28", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view});
            }
            return view;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            }
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }

        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
            }
        }
    }

    private static Fragment installFragment(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, String str3, HashMap<String, Object> hashMap, String str4, int i, String str5, Serializable serializable) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c77543ca", new Object[]{fragmentActivity, cls, str, str2, str3, hashMap, str4, new Integer(i), str5, serializable});
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (TextUtils.isEmpty(str5)) {
            str6 = FRAGMENT_TAG;
        } else {
            str6 = str5;
        }
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str6);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        Bundle bundle = new Bundle();
        bundle.putString(FRAGMENT_ARG_TAG, str6);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString(FRAGMENT_ARG_RENDER_URL, str3);
        }
        if (hashMap != null) {
            bundle.putSerializable(FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString(FRAGMENT_ARG_INIT_DATA, str4);
        }
        if (serializable != null) {
            bundle.putSerializable(FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        Fragment instantiate = Fragment.instantiate(fragmentActivity, cls.getName(), bundle);
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (TextUtils.isEmpty(str5)) {
            str5 = FRAGMENT_TAG;
        }
        beginTransaction.add(i, instantiate, str5);
        beginTransaction.commitAllowingStateLoss();
        return instantiate;
    }

    public static /* synthetic */ Object ipc$super(WeexPageFragment weexPageFragment, String str, Object... objArr) {
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
            case 188604040:
                super.onStop();
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/bundle/WeexPageFragment");
        }
    }

    private boolean isScollViewOnTop(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2546fdc6", new Object[]{this, viewGroup})).booleanValue();
        }
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            if (!(childAt instanceof WXScrollView) || ((WXScrollView) childAt).getScrollY() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Deprecated
    public static Fragment newInstance(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("5c5d288d", new Object[]{fragmentActivity, cls, str, new Integer(i)}) : installFragment(fragmentActivity, cls, null, str, str, null, null, i, null, null);
    }

    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("f5117dd7", new Object[]{fragmentActivity, cls, str, str2, new Integer(i)}) : installFragment(fragmentActivity, cls, str, str2, null, null, null, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("94f2d958", new Object[]{fragmentActivity, cls, str, str2, new Integer(i)}) : installFragment(fragmentActivity, cls, null, str, str2, null, null, i, null, null);
    }

    private void registerBroadcastReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3799b774", new Object[]{this});
            return;
        }
        if (WXEnvironment.isApkDebugable()) {
            this.mRefreshReceiver = new BroadcastReceiver() { // from class: com.alibaba.aliweex.bundle.WeexPageFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/bundle/WeexPageFragment$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else {
                        WeexPageFragment.this.reload();
                    }
                }
            };
            getActivity().registerReceiver(this.mRefreshReceiver, new IntentFilter("DEBUG_INSTANCE_REFRESH"));
        }
        try {
            this.mReloadReceiver = new BroadcastReceiver() { // from class: com.alibaba.aliweex.bundle.WeexPageFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/bundle/WeexPageFragment$3");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (WeexPageFragment.this.getContext() != null) {
                        WeexPageFragment.this.reload();
                    }
                }
            };
            getActivity().registerReceiver(this.mReloadReceiver, new IntentFilter("INSTANCE_RELOAD"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void showFullScreenActionbar() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbc8c4c", new Object[]{this});
        } else if (this.mFullScreen != null && getActivity() != null && this.mFullScreen.booleanValue()) {
            try {
                if (getActivity().getActionBar() != null) {
                    getActivity().getActionBar().hide();
                } else {
                    try {
                        IpChange ipChange2 = AppCompatActivity.$ipChange;
                        if ((getActivity() instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar()) != null) {
                            supportActionBar.hide();
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void showFullScreenSystemStatusbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ec5321", new Object[]{this});
        } else if (this.mFullScreen != null && getActivity() != null && this.mFullScreen.booleanValue()) {
            try {
                getActivity().getWindow().getDecorView().setSystemUiVisibility(4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void transformUrl() {
        e2i e2iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9943b56a", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(FRAGMENT_ARG_URI);
            String string2 = arguments.getString(FRAGMENT_ARG_BUNDLE_URL);
            String string3 = arguments.getString(FRAGMENT_ARG_RENDER_URL);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                e2i e2iVar2 = this.mRenderPresenter;
                if (e2iVar2 != null) {
                    e2iVar2.i(string2, string3);
                }
            } else if (!TextUtils.isEmpty(string) && (e2iVar = this.mRenderPresenter) != null) {
                e2iVar.i(string, string);
            }
        }
    }

    public void addViewToRoot(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87827908", new Object[]{this, view});
            return;
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    public e2i createRenderPresenter(gbe gbeVar, f2i f2iVar, c2i c2iVar, n7x n7xVar, g2i g2iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2i) ipChange.ipc$dispatch("fe51eb5d", new Object[]{this, gbeVar, f2iVar, c2iVar, n7xVar, g2iVar});
        }
        return new u0o(getActivity(), this.mFtag, gbeVar, f2iVar, c2iVar, n7xVar, getNavBarAdapter(), g2iVar, this.mEnableUnicornWeexRender);
    }

    public void destroyWeex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fea622", new Object[]{this});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.j();
        }
        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.b(str, map);
        }
    }

    public void fireGlobalEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143b6cd3", new Object[]{this, str, map});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null && e2iVar.f() != null) {
            this.mRenderPresenter.f().B(str, map);
        }
    }

    public cvw getNavBarAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cvw) ipChange.ipc$dispatch("40cdc013", new Object[]{this});
        }
        return this.mNavBarAdapter;
    }

    public NestedContainer getNestedContainer(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedContainer) ipChange.ipc$dispatch("984d011a", new Object[]{this, wXSDKInstance});
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.getNestedContainer(wXSDKInstance);
        }
        return null;
    }

    public String getOriginalRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("992695c7", new Object[]{this});
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.e();
        }
        return "";
    }

    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this});
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.getOriginalUrl();
        }
        return "";
    }

    public String getRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.k();
        }
        return "";
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.getUrl();
        }
        return "";
    }

    public WXSDKInstance getWXSDKInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("169676dd", new Object[]{this});
        }
        return this.mRenderPresenter.f();
    }

    @Deprecated
    public boolean isAtTop() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a568d1a3", new Object[]{this})).booleanValue();
        }
        try {
            if (!(this.mRootView.getParent() instanceof FrameLayout) || !(((FrameLayout) this.mRootView.getParent()).getChildAt(1) instanceof ViewGroup)) {
                z = false;
            } else {
                z = isScollViewOnTop((ViewGroup) ((FrameLayout) this.mRootView.getParent()).getChildAt(1));
            }
            if (z) {
                return z;
            }
            try {
                FrameLayout frameLayout = this.mRootView;
                if (frameLayout == null || frameLayout.getChildCount() <= 0) {
                    return z;
                }
                View childAt = this.mRootView.getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    return isScollViewOnTop((ViewGroup) childAt);
                }
                return z;
            } catch (Exception unused) {
                z2 = z;
                return z2;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && getContext() != null) {
            String string = arguments.getString(FRAGMENT_ARG_URI);
            String string2 = arguments.getString(FRAGMENT_ARG_BUNDLE_URL);
            String string3 = arguments.getString(FRAGMENT_ARG_RENDER_URL);
            String string4 = arguments.getString(FRAGMENT_ARG_TEMPLATE);
            HashMap hashMap = (HashMap) arguments.getSerializable(FRAGMENT_ARG_CUSTOM_OPT);
            String string5 = arguments.getString(FRAGMENT_ARG_INIT_DATA);
            if (!(this.mRenderPresenter == null || getContext() == null)) {
                this.mRenderPresenter.h(this.mRootView, hashMap, string5, string4, string2, string3, string);
            }
            arguments.remove(FRAGMENT_ARG_TEMPLATE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onActivityResult(i, i2, intent);
        }
        if (intent == null) {
            intent2 = new Intent();
        } else {
            intent2 = new Intent(intent);
        }
        intent2.setAction(WXModule.ACTION_ACTIVITY_RESULT);
        intent2.putExtra("requestCode", i);
        intent2.putExtra("resultCode", i2);
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.mEnableUnicornWeexRender = enableUnicornRender();
        if (this.mUTEnable) {
            if (this.mUTPresenter == null) {
                this.mUTPresenter = new j2v(getActivity());
            }
            ((j2v) this.mUTPresenter).h();
        }
        if (this.mDyUrlEnable && this.mDynamicUrlPresenter == null) {
            this.mDynamicUrlPresenter = new s58();
        }
        if (!this.mEnableUnicornWeexRender && this.mProgressBarView == null) {
            this.mProgressBarView = new e97();
        }
        if (this.mUrlValidate == null) {
            this.mUrlValidate = new cpv(getActivity());
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        fzc.a aVar = this.mOnBackPressedListener;
        if (aVar != null) {
            aVar.a(0);
            return true;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.onBackPressed();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        parseArgsFromActivity();
        registerBroadcastReceiver();
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onCreateOptionsMenu(menu);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        n7x n7xVar = this.mProgressBarView;
        if (n7xVar != null) {
            frameLayout.addView(n7xVar.a(getContext()));
        }
        ViewStub viewStub = new ViewStub(getContext());
        viewStub.setId(R.id.wx_fragment_error);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub.setLayoutResource(R.layout.weex_content_error);
        viewStub.setVisibility(8);
        frameLayout.addView(viewStub);
        this.mRootView = frameLayout;
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onActivityDestroy();
        }
        d2i d2iVar = this.mErrorView;
        if (d2iVar != null) {
            ((d97) d2iVar).c();
        }
        if (WXEnvironment.isApkDebugable() && this.mRefreshReceiver != null) {
            getActivity().unregisterReceiver(this.mRefreshReceiver);
            this.mRefreshReceiver = null;
        }
        if (this.mReloadReceiver != null) {
            getActivity().unregisterReceiver(this.mReloadReceiver);
            this.mReloadReceiver = null;
        }
        f2i f2iVar = this.mUTPresenter;
        if (f2iVar != null) {
            ((j2v) f2iVar).b();
        }
        cvw cvwVar = this.mNavBarAdapter;
        if (cvwVar != null) {
            cvwVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            if (this.mNavBarAdapter != null) {
                WXSDKManager.getInstance().setActivityNavBarSetter(this.mNavBarAdapter);
            }
            getActivity().invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        f2i f2iVar = this.mUTPresenter;
        if (f2iVar != null) {
            ((j2v) f2iVar).f();
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onActivityPause();
        }
        if (this.mNoAnimated && getActivity() != null) {
            getActivity().overridePendingTransition(0, 0);
        }
        WXSDKManager.getInstance().setActivityNavBarSetter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        showFullScreenSystemStatusbar();
        f2i f2iVar = this.mUTPresenter;
        if (f2iVar != null) {
            ((j2v) f2iVar).e(getUrl());
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onActivityResume();
        }
        if (this.mNavBarAdapter != null) {
            WXSDKManager.getInstance().setActivityNavBarSetter(this.mNavBarAdapter);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onActivityStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.onActivityStop();
        }
    }

    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            return e2iVar.a();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.mRenderPresenter == null) {
            HashMap hashMap = new HashMap(1);
            if (this.mRenderListener == null) {
                str = "No";
            } else {
                str = "Yes";
            }
            hashMap.put("ListenerValue", str);
            kr0.e().h("createWXRenderListener", hashMap);
            com.alibaba.aliweex.bundle.a aVar = new com.alibaba.aliweex.bundle.a(this.mRootView, this.mProgressBarView, this.mUTPresenter, this.mRenderListener, new a());
            this.mWXRenderListener = aVar;
            e2i createRenderPresenter = createRenderPresenter(aVar, this.mUTPresenter, this.mDynamicUrlPresenter, this.mProgressBarView, this.mUrlValidate);
            this.mRenderPresenter = createRenderPresenter;
            if (createRenderPresenter != null) {
                if (this.mErrorView == null) {
                    this.mErrorView = new d97(this.mRenderPresenter);
                }
                this.mWXRenderListener.f(this.mErrorView);
                transformUrl();
                this.mRenderPresenter.setRenderContainer(this.mRenderContainer);
            }
        }
    }

    public void onWXException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda540c", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        c2i c2iVar = this.mDynamicUrlPresenter;
        if (c2iVar != null) {
            ((s58) c2iVar).e(wXSDKInstance, str, str2);
        }
    }

    public void onWXViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be11bc0e", new Object[]{this, wXSDKInstance, view});
            return;
        }
        if ((wXSDKInstance instanceof AliWXSDKInstance) && getNavBarAdapter() != null) {
            ((AliWXSDKInstance) wXSDKInstance).I1(getNavBarAdapter());
        }
        g2i g2iVar = this.mUrlValidate;
        if (g2iVar != null) {
            g2iVar.a(wXSDKInstance, view);
        }
    }

    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.reload();
        }
    }

    public void replace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244830cf", new Object[]{this, str, str2});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.g(str, str2);
        }
    }

    public void setBackPressedListener(fzc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a43ab", new Object[]{this, aVar});
        } else {
            this.mOnBackPressedListener = aVar;
        }
    }

    public void setDynamicUrlEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d3e178", new Object[]{this, new Boolean(z)});
        } else {
            this.mDyUrlEnable = z;
        }
    }

    public void setErrorView(d2i d2iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a0a070", new Object[]{this, d2iVar});
        } else {
            this.mErrorView = d2iVar;
        }
    }

    public void setNavBarAdapter(cvw cvwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9121d1", new Object[]{this, cvwVar});
        } else {
            this.mNavBarAdapter = cvwVar;
        }
    }

    public void setProgressBarView(n7x n7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1278e5fc", new Object[]{this, n7xVar});
        } else {
            this.mProgressBarView = n7xVar;
        }
    }

    public void setRenderContainer(RenderContainer renderContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76916e13", new Object[]{this, renderContainer, new Boolean(z)});
            return;
        }
        this.mRenderContainer = renderContainer;
        this.mIsHeron = false;
    }

    public void setRenderListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e4dd32", new Object[]{this, bVar});
            return;
        }
        this.mRenderListener = bVar;
        com.alibaba.aliweex.bundle.a aVar = this.mWXRenderListener;
        if (aVar != null && aVar.a() == null) {
            kr0.e().h("ReSetRenderListener", null);
            this.mWXRenderListener.g(bVar);
        }
    }

    public void setUserTrackEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc442ac", new Object[]{this, new Boolean(z)});
        } else {
            this.mUTEnable = z;
        }
    }

    public void setUserTrackPresenter(f2i f2iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1830b93", new Object[]{this, f2iVar});
        } else {
            this.mUTPresenter = f2iVar;
        }
    }

    @Deprecated
    public void startRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad0d929", new Object[]{this, str});
        } else {
            startRenderByTemplate(str, null, null);
        }
    }

    @Deprecated
    public void startRenderByTemplate(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f9cad5", new Object[]{this, str, map, str2});
        } else {
            startRenderByTemplate(str, "", map, str2);
        }
    }

    public void startRenderByUrl(Map<String, Object> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b8979c", new Object[]{this, map, str, str2, str3});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.c(map, str, str2, str3);
        }
    }

    @Deprecated
    public void startRenderWXByUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb1f2ba", new Object[]{this, str, str2});
        } else {
            startRenderByUrl(null, null, str, str2);
        }
    }

    private boolean enableUnicornRender() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f53f696", new Object[]{this})).booleanValue();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        Serializable serializable = arguments.getSerializable(FRAGMENT_ARG_CUSTOM_OPT);
        if (!(serializable instanceof HashMap) || (obj = ((HashMap) serializable).get("enable_unicorn_weex_render")) == null) {
            return false;
        }
        return "true".equals(String.valueOf(obj));
    }

    public static Fragment newInstance(Context context, Class<? extends WeexPageFragment> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("804a3f09", new Object[]{context, cls, str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString(FRAGMENT_ARG_BUNDLE_URL, str);
        bundle.putString(FRAGMENT_ARG_RENDER_URL, str2);
        Fragment instantiate = Fragment.instantiate(context, cls.getName(), bundle);
        instantiate.setArguments(bundle);
        return instantiate;
    }

    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("71208bbc", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i)}) : installFragment(fragmentActivity, cls, str, str2, null, hashMap, str3, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i, Serializable serializable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("32b36b44", new Object[]{fragmentActivity, cls, str, str2, new Integer(i), serializable}) : installFragment(fragmentActivity, cls, null, str, str2, null, null, i, null, serializable);
    }

    @Deprecated
    public void startRender(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7fbe06", new Object[]{this, str, map, str2});
        } else {
            startRenderByTemplate(str, map, str2);
        }
    }

    public void startRenderByTemplate(String str, String str2, Map<String, Object> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f1ccb", new Object[]{this, str, str2, map, str3});
            return;
        }
        e2i e2iVar = this.mRenderPresenter;
        if (e2iVar != null) {
            e2iVar.d(str, str2, map, str3);
        }
    }

    @Deprecated
    public void startRenderWXByUrl(Map<String, Object> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611ab6bd", new Object[]{this, map, str, str2, str3});
        } else {
            startRenderByUrl(map, str, str2, str3);
        }
    }

    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("a1aed932", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i), str4}) : installFragment(fragmentActivity, cls, str, str2, null, hashMap, str3, i, str4, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("422cfcdb", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i)}) : installFragment(fragmentActivity, cls, null, str, str2, hashMap, str3, i, null, null);
    }

    private void parseArgsFromActivity() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148d4730", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(FRAGMENT_ARG_FROM_ACTIVITY);
            this.mFtag = arguments.getString(FRAGMENT_ARG_TAG);
            if (serializable instanceof Map) {
                Map map = (Map) serializable;
                String str = (String) map.get("orientation");
                if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("landscape") && getActivity() != null) {
                    String str2 = (String) map.get("preferredOrientation");
                    if ("landscapeRight".equalsIgnoreCase(str2)) {
                        getActivity().setRequestedOrientation(0);
                    } else if ("landscapeLeft".equalsIgnoreCase(str2)) {
                        getActivity().setRequestedOrientation(8);
                    } else {
                        getActivity().setRequestedOrientation(6);
                    }
                }
                this.mFullScreen = Boolean.valueOf((String) map.get("fullscreen"));
                showFullScreenSystemStatusbar();
                showFullScreenActionbar();
                Object obj = map.get("animated");
                if (obj != null) {
                    if (obj instanceof String) {
                        z = Boolean.parseBoolean((String) obj);
                    } else {
                        z = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                    }
                    this.mNoAnimated = !z;
                }
            }
        }
    }

    public static boolean shouldDegrade(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983359fc", new Object[]{wXSDKInstance, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.contains("|")) {
            return TextUtils.equals("1", str.substring(0, str.indexOf("|")));
        }
        WXErrorCode wXErrorCode = WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED;
        if (!TextUtils.equals(str, wXErrorCode.getErrorCode()) || TextUtils.isEmpty(str2) || !str2.contains("createInstance fail")) {
            WXErrorCode wXErrorCode2 = WXErrorCode.WX_DEGRAD_EAGLE_RENDER_ERROR;
            if (!TextUtils.equals(str, wXErrorCode2.getErrorCode()) || TextUtils.isEmpty(str2) || !str2.contains("eagleRenderErr")) {
                WXErrorCode wXErrorCode3 = WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR;
                if (!TextUtils.equals(str, wXErrorCode3.getErrorCode()) || TextUtils.isEmpty(str2) || !str2.contains("degradeToH5")) {
                    WXErrorCode wXErrorCode4 = WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED;
                    if (!TextUtils.equals(str, wXErrorCode4.getErrorCode()) || TextUtils.isEmpty(str2) || !str2.contains("degradeToH5")) {
                        WXErrorCode wXErrorCode5 = WXErrorCode.WX_ERR_JSC_CRASH;
                        if (!TextUtils.equals(str, wXErrorCode5.getErrorCode()) || TextUtils.isEmpty(str2) || !str2.contains("degradeToH5")) {
                            WXErrorCode wXErrorCode6 = WXErrorCode.WX_DEGRAD_WAIT_INIT_TIMEOUT;
                            if (TextUtils.equals(str, wXErrorCode6.getErrorCode())) {
                                String N = wXSDKInstance.N();
                                WXExceptionUtils.commitCriticalExceptionRT(N, wXErrorCode6, "shouldDegrade", wXErrorCode6.getErrorMsg() + "-- " + str2, null);
                                return true;
                            }
                            WXErrorCode wXErrorCode7 = WXErrorCode.WX_FORCEQJS_DEGRADE;
                            if (!TextUtils.equals(str, wXErrorCode7.getErrorCode())) {
                                return TextUtils.equals(str, WXErrorCode.WX_ERR_LOAD_SO.getErrorCode());
                            }
                            String N2 = wXSDKInstance.N();
                            WXExceptionUtils.commitCriticalExceptionRT(N2, wXErrorCode7, "shouldDegrade", wXErrorCode7.getErrorMsg() + "-- " + str2, null);
                            return true;
                        }
                        String N3 = wXSDKInstance.N();
                        WXExceptionUtils.commitCriticalExceptionRT(N3, wXErrorCode5, "shouldDegrade", wXErrorCode5.getErrorMsg() + "-- " + str2, null);
                        return true;
                    }
                    String N4 = wXSDKInstance.N();
                    WXExceptionUtils.commitCriticalExceptionRT(N4, wXErrorCode4, "shouldDegrade", wXErrorCode4.getErrorMsg() + "-- " + str2, null);
                    return true;
                }
                String N5 = wXSDKInstance.N();
                WXExceptionUtils.commitCriticalExceptionRT(N5, wXErrorCode3, "shouldDegrade", wXErrorCode3.getErrorMsg() + " -- " + str2, null);
                return true;
            }
            String N6 = wXSDKInstance.N();
            WXExceptionUtils.commitCriticalExceptionRT(N6, wXErrorCode2, "shouldDegrade", wXErrorCode2.getErrorMsg() + " -- " + str2, null);
            return true;
        }
        String N7 = wXSDKInstance.N();
        WXExceptionUtils.commitCriticalExceptionRT(N7, wXErrorCode, "shouldDegrade", wXErrorCode.getErrorMsg() + " -- " + str2, null);
        return true;
    }

    static {
        t2o.a(85983285);
    }

    @Deprecated
    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("9ea1f08d", new Object[]{fragmentActivity, cls, str, new Integer(i)}) : installFragment(fragmentActivity, cls, str, null, null, null, null, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("e482e091", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i), str4}) : installFragment(fragmentActivity, cls, null, str, str2, hashMap, str3, i, str4, null);
    }

    @Deprecated
    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, HashMap<String, Object> hashMap, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("7c0ab2c6", new Object[]{fragmentActivity, cls, str, hashMap, str2, new Integer(i)}) : installFragment(fragmentActivity, cls, str, null, null, hashMap, str2, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i, String str4, Serializable serializable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("567f51bd", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i), str4, serializable}) : installFragment(fragmentActivity, cls, null, str, str2, hashMap, str3, i, str4, serializable);
    }

    @Deprecated
    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, HashMap<String, Object> hashMap, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("83a511bc", new Object[]{fragmentActivity, cls, str, hashMap, str2, new Integer(i), str3}) : installFragment(fragmentActivity, cls, str, null, null, hashMap, str2, i, str3, null);
    }
}
