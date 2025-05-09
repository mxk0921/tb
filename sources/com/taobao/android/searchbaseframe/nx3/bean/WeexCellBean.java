package com.taobao.android.searchbaseframe.nx3.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean adjust;
    public String degradeType;
    public WeexBean mWeexBean;
    public final Map<String, Object> mStorage = new HashMap();
    public boolean videoPlayable = false;
    public final Map<String, Object> mExtraObj = new HashMap();

    static {
        t2o.a(993001916);
    }

    public static /* synthetic */ Object ipc$super(WeexCellBean weexCellBean, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1467749990) {
            super.copyCellData((BaseCellBean) objArr[0]);
            return null;
        } else if (hashCode == -853395924) {
            return super.copy();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/nx3/bean/WeexCellBean");
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public void copyCellData(BaseCellBean baseCellBean) {
        WeexBean weexBean;
        WeexBean weexBean2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a883e99a", new Object[]{this, baseCellBean});
            return;
        }
        super.copyCellData(baseCellBean);
        if (baseCellBean instanceof WeexCellBean) {
            WeexCellBean weexCellBean = (WeexCellBean) baseCellBean;
            weexCellBean.videoPlayable = this.videoPlayable;
            weexCellBean.mStorage.putAll(this.mStorage);
            WeexBean weexBean3 = weexCellBean.mWeexBean;
            if (!(weexBean3 == null || (weexBean2 = this.mWeexBean) == null)) {
                weexBean3.mStorage.putAll(weexBean2.mStorage);
            }
            WeexBean weexBean4 = weexCellBean.mWeexBean;
            if (weexBean4 != null && (weexBean = this.mWeexBean) != null) {
                ListStyle listStyle = ListStyle.LIST;
                weexBean4.updateCachedHeight(listStyle, weexBean.getCachedHeight(listStyle));
                WeexBean weexBean5 = weexCellBean.mWeexBean;
                ListStyle listStyle2 = ListStyle.WATERFALL;
                weexBean5.updateCachedHeight(listStyle2, this.mWeexBean.getCachedHeight(listStyle2));
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public WeexCellBean copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCellBean) ipChange.ipc$dispatch("f0a4ba6b", new Object[]{this});
        }
        WeexCellBean weexCellBean = (WeexCellBean) super.copy();
        WeexBean weexBean = new WeexBean();
        weexCellBean.mWeexBean = weexBean;
        this.mWeexBean.copy(weexBean);
        weexCellBean.mExtraObj.putAll(this.mExtraObj);
        weexCellBean.mStorage.putAll(this.mStorage);
        weexCellBean.videoPlayable = this.videoPlayable;
        return weexCellBean;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public WeexCellBean copyCellBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexCellBean) ipChange.ipc$dispatch("75aa2c59", new Object[]{this}) : new WeexCellBean();
    }
}
