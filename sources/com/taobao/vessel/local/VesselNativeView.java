package com.taobao.vessel.local;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import java.util.Map;
import tb.f4w;
import tb.g4w;
import tb.t2o;
import tb.uyv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VesselNativeView extends VesselBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable loadRunnabe;
    private String mBundleName;
    private String mClassName;
    private Handler mHandler;
    public VesselNativeFrameLayout mNativeFrameLayout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!uyv.b(VesselNativeView.this.getContext())) {
                VesselNativeView.access$000(VesselNativeView.this);
            }
        }
    }

    static {
        t2o.a(967835669);
    }

    public VesselNativeView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(VesselNativeView vesselNativeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e3580a", new Object[]{vesselNativeView});
        } else {
            vesselNativeView.loadView();
        }
    }

    private void getExternalViewFromeBundle(String str) {
        if (str != null) {
            this.mOriginUrl = str;
            this.mBundleName = uyv.j(str);
            String k = uyv.k(str);
            this.mClassName = k;
            if (this.mBundleName != null && k != null) {
                try {
                    this.mNativeFrameLayout = (VesselNativeFrameLayout) Class.forName(k).getConstructor(Context.class).newInstance(getContext());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(VesselNativeView vesselNativeView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/local/VesselNativeView");
    }

    private void loadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9c7b2", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            onLoadError(new g4w(f4w.LOAD_ERROR, f4w.LOAD_DATA_NULL, VesselType.Native));
            return;
        }
        vesselNativeFrameLayout.setVesselParams(this.mOriginParams);
        this.mNativeFrameLayout.setVesselViewCallback(this.mVesselViewCallback);
        this.mNativeFrameLayout.setOnLoadListener(this);
        this.mNativeFrameLayout.setScrollViewListener(this);
        this.mNativeFrameLayout.onViewCreated(this.mNativeFrameLayout.onCreateView(LayoutInflater.from(getContext()), this.mNativeFrameLayout, null), null);
        if (this.mNativeFrameLayout.getParent() == null) {
            addView(this.mNativeFrameLayout);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else {
            fireEvent(map);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public View getChildView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this});
        }
        return this.mNativeFrameLayout;
    }

    public VesselNativeFrameLayout getNativeFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselNativeFrameLayout) ipChange.ipc$dispatch("23b7cc15", new Object[]{this});
        }
        return this.mNativeFrameLayout;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    @Deprecated
    public void loadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
            return;
        }
        onLoadStart();
        if (obj != null) {
            this.mOriginParams = obj;
        }
        getExternalViewFromeBundle(str);
        loadView();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout != null) {
            vesselNativeFrameLayout.onDestroy();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout != null) {
            vesselNativeFrameLayout.onPause();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout != null) {
            vesselNativeFrameLayout.onResume();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout != null) {
            vesselNativeFrameLayout.onStart();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout != null) {
            vesselNativeFrameLayout.onStop();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null) {
            loadUrl(this.mOriginUrl, obj);
        } else {
            loadUrl(this.mOriginUrl, this.mOriginParams);
        }
        return false;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void releaseMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01c06f", new Object[]{this});
            return;
        }
        removeAllViews();
        if (this.mNativeFrameLayout != null) {
            this.mNativeFrameLayout = null;
        }
        onDestroy();
    }

    public VesselNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void fireEvent(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9667739a", new Object[]{this, map});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout != null) {
            vesselNativeFrameLayout.onFireEvent(map);
        }
    }

    public VesselNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler();
        this.loadRunnabe = new a();
        if (getId() == -1) {
            setId(uyv.i());
        }
    }
}
