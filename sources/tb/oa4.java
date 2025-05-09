package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.nb4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class oa4<T extends nb4> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_TYPE_HASH_ID = -1;
    public static final String ITEM_CLICK = "itemClick";
    public static final Object sLock = new Object();
    private static final AtomicInteger sTypeCount = new AtomicInteger(0);
    private static final ConcurrentHashMap<Integer, Integer> sTypeMap = new ConcurrentHashMap<>(0);
    private volatile boolean isViewHide;
    public T mComponentData;
    public Context mContext;
    private volatile boolean mCreated;
    private Map<String, Object> mData;
    private volatile boolean mDestroyed;
    public ze7 mDetailContext;
    public DataEntry[] mInitComponentData;
    public qql<rql> mParentGroup;
    public int mType;
    public View mView;
    private zy9 mFrameSize = new zy9(-1, -2, 17);
    public int mLastWidthMeasureSpec = Integer.MIN_VALUE;
    public int mLastHeightMeasureSpec = Integer.MIN_VALUE;

    static {
        t2o.a(912261400);
    }

    public oa4(Context context, ze7 ze7Var, T t, DataEntry... dataEntryArr) {
        this.mInitComponentData = dataEntryArr;
        if (dataEntryArr != null && dataEntryArr.length > 0) {
            for (DataEntry dataEntry : dataEntryArr) {
                setData(dataEntry.getKey(), dataEntry.getValue());
            }
        }
        this.mContext = context;
        this.mDetailContext = ze7Var;
        this.mComponentData = t;
        if (t != null) {
            this.mType = buildNewTypeId();
            return;
        }
        throw new NullPointerException("Component constructor's parameter componentData can not be null");
    }

    private void updateComponentViewState() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1519b59f", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null) {
            if (this.isViewHide) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final int buildNewTypeId() {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0c6fde1", new Object[]{this})).intValue();
        }
        synchronized (sLock) {
            try {
                int dataTypeHashId = getDataTypeHashId();
                ConcurrentHashMap<Integer, Integer> concurrentHashMap = sTypeMap;
                Integer num = concurrentHashMap.get(Integer.valueOf(dataTypeHashId));
                if (num == null) {
                    num = Integer.valueOf(sTypeCount.getAndIncrement());
                    concurrentHashMap.put(Integer.valueOf(dataTypeHashId), num);
                }
                intValue = num.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
        } else if (!this.mCreated) {
            this.mCreated = true;
            onCreate();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.mDestroyed) {
            this.mDestroyed = true;
            onDestroy();
        }
    }

    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else {
            onDidAppear();
        }
    }

    public void disAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
        } else {
            onDisAppear();
        }
    }

    public <C extends oa4> C findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        if (TextUtils.equals(str, this.mComponentData.g())) {
            return this;
        }
        return null;
    }

    public <C extends oa4> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        if (TextUtils.equals(str, this.mComponentData.k())) {
            return this;
        }
        return null;
    }

    public void fireExposeEvent(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765943cf", new Object[]{this, runtimeAbilityParamArr});
        } else {
            this.mDetailContext.b().g(this.mComponentData.e(), appendTriggerComponent(true, runtimeAbilityParamArr));
        }
    }

    public T getComponentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((nb4) ipChange.ipc$dispatch("25e9e114", new Object[]{this}));
        }
        return this.mComponentData;
    }

    public final View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view});
        }
        View onGetComponentView = onGetComponentView(view);
        this.mView = onGetComponentView;
        updateComponentViewState();
        return onGetComponentView;
    }

    public int getComponentViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35aac060", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public <D> D getData(String str) {
        D d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (D) ipChange.ipc$dispatch("7624f4a1", new Object[]{this, str});
        }
        if (str != null) {
            Map<String, Object> map = this.mData;
            if (map != null) {
                d = (D) map.get(str);
            } else {
                d = null;
            }
            if (d != null) {
                return d;
            }
            qql parentComponent = getParentComponent();
            if (parentComponent != null) {
                return (D) parentComponent.getData(str);
            }
        }
        return null;
    }

    public int getDataTypeHashId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30064ddd", new Object[]{this})).intValue();
        }
        if (this.mComponentData.j() == null) {
            return -1;
        }
        return this.mComponentData.j().hashCode();
    }

    public final zy9 getFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("6b3594c0", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        return onGetFrameSize(i, i2);
    }

    public <C extends qql> C getParentComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((qql) ipChange.ipc$dispatch("df8e600", new Object[]{this}));
        }
        return this.mParentGroup;
    }

    public String getRenderName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50aa3a22", new Object[]{this});
        }
        return null;
    }

    public String getRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        return null;
    }

    public String getRenderVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7e977cd", new Object[]{this});
        }
        return null;
    }

    public final void hideComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154f48e2", new Object[]{this});
            return;
        }
        this.isViewHide = true;
        updateComponentViewState();
    }

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
        } else {
            fireExposeEvent(new RuntimeAbilityParam[0]);
        }
    }

    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        }
    }

    public abstract View onGetComponentView(View view);

    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mFrameSize;
    }

    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        }
    }

    public void onWillDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7817f9", new Object[]{this});
        }
    }

    public void setData(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0b8b59", new Object[]{this, str, obj});
        } else if (str != null && obj != null) {
            if (this.mData == null) {
                this.mData = new ConcurrentHashMap(1);
            }
            this.mData.put(str, obj);
        }
    }

    public final void showComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690fb307", new Object[]{this});
            return;
        }
        this.isViewHide = false;
        updateComponentViewState();
    }

    public void triggerClickEvent(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df04e5", new Object[]{this, runtimeAbilityParamArr});
        } else {
            this.mDetailContext.b().g(this.mComponentData.b("itemClick"), appendTriggerComponent(false, runtimeAbilityParamArr));
        }
    }

    public void updateComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628120bb", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null) {
            this.mView = onGetComponentView(view);
            updateComponentViewState();
            this.mView.requestLayout();
        }
    }

    public void updateRenderType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1605896a", new Object[]{this, str});
            return;
        }
        this.mComponentData.n(str);
        this.mType = buildNewTypeId();
    }

    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else {
            onWillAppear();
        }
    }

    public void willDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d244c18", new Object[]{this});
        } else {
            onWillDisAppear();
        }
    }

    public RuntimeAbilityParam[] appendTriggerComponent(boolean z, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeAbilityParam[]) ipChange.ipc$dispatch("a2e9efae", new Object[]{this, new Boolean(z), runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            runtimeAbilityParamArr = new RuntimeAbilityParam[0];
        }
        List a2 = uug.a(runtimeAbilityParamArr);
        a2.add(new RuntimeAbilityParam("ttTriggerComponent", this));
        if (z) {
            a2.add(new RuntimeAbilityParam("ttTriggerView", this.mView));
            a2.add(new RuntimeAbilityParam("ttTriggerRootView", this.mView));
        }
        return (RuntimeAbilityParam[]) a2.toArray(new RuntimeAbilityParam[0]);
    }
}
