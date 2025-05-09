package com.taobao.android.searchbaseframe.nx3.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.oyw;
import tb.ryw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MuiseCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int beanId;
    public MuiseBean mMuiseBean;
    public String ndPreviewBizName;
    public String ndPreviewUrl;
    public boolean removed;
    private static final AtomicInteger INSTANCE_ID_COUNTER = new AtomicInteger(0);
    private static final ryw<MuiseCellBean> BEAN_MAP = new ryw<>();
    private static final oyw<MuiseCellBean> ID_BEAN_MAP = new oyw<>();
    public final Map<String, Object> mStorage = new HashMap();
    public boolean mStorageUpdated = false;
    public boolean videoPlayable = false;
    public boolean videoForcePlay = false;
    public boolean hasPreRequestDetail = false;
    public boolean ndPreview = false;
    public boolean ndPreviewTriggered = false;
    public final Map<String, Object> mExtraObj = new HashMap();
    public boolean requestLayout = false;
    public boolean layoutCalcDone = false;
    public boolean invisibleCell = false;

    static {
        t2o.a(993001911);
    }

    public MuiseCellBean() {
        int incrementAndGet = INSTANCE_ID_COUNTER.incrementAndGet() % Integer.MAX_VALUE;
        this.beanId = incrementAndGet;
        BEAN_MAP.a(incrementAndGet, this);
    }

    public static MuiseCellBean findById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("c8247648", new Object[]{new Integer(i)});
        }
        return BEAN_MAP.b(i);
    }

    public static MuiseCellBean findByLongId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("f45087ad", new Object[]{new Long(j)});
        }
        return ID_BEAN_MAP.b(j);
    }

    public static /* synthetic */ Object ipc$super(MuiseCellBean muiseCellBean, String str, Object... objArr) {
        if (str.hashCode() == -853395924) {
            return super.copy();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/nx3/bean/MuiseCellBean");
    }

    public static void recordLongId(long j, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6223f2", new Object[]{new Long(j), muiseCellBean});
        } else {
            ID_BEAN_MAP.a(j, muiseCellBean);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public <T extends BaseCellBean> T copyCellBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((BaseCellBean) ipChange.ipc$dispatch("8656331a", new Object[]{this}));
        }
        return new MuiseCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public void copyCellData(BaseCellBean baseCellBean) {
        MuiseBean muiseBean;
        MuiseBean muiseBean2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a883e99a", new Object[]{this, baseCellBean});
        } else if (baseCellBean instanceof MuiseCellBean) {
            MuiseCellBean muiseCellBean = (MuiseCellBean) baseCellBean;
            muiseCellBean.mStorage.putAll(this.mStorage);
            MuiseBean muiseBean3 = muiseCellBean.mMuiseBean;
            if (!(muiseBean3 == null || (muiseBean2 = this.mMuiseBean) == null)) {
                muiseBean3.mStorage.putAll(muiseBean2.mStorage);
            }
            MuiseBean muiseBean4 = muiseCellBean.mMuiseBean;
            if (muiseBean4 != null && (muiseBean = this.mMuiseBean) != null) {
                ListStyle listStyle = ListStyle.LIST;
                muiseBean4.updateCachedHeight(listStyle, muiseBean.getCachedHeight(listStyle));
                MuiseBean muiseBean5 = muiseCellBean.mMuiseBean;
                ListStyle listStyle2 = ListStyle.WATERFALL;
                muiseBean5.updateCachedHeight(listStyle2, this.mMuiseBean.getCachedHeight(listStyle2));
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public MuiseCellBean copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("9f0a3af3", new Object[]{this});
        }
        MuiseCellBean muiseCellBean = (MuiseCellBean) super.copy();
        MuiseBean muiseBean = new MuiseBean();
        muiseCellBean.mMuiseBean = muiseBean;
        this.mMuiseBean.copy(muiseBean);
        muiseCellBean.mExtraObj.putAll(this.mExtraObj);
        muiseCellBean.mStorage.putAll(this.mStorage);
        muiseCellBean.videoPlayable = this.videoPlayable;
        muiseCellBean.videoForcePlay = this.videoForcePlay;
        return muiseCellBean;
    }
}
