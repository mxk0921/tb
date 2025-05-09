package com.taobao.android.meta.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;
import java.util.Collection;
import tb.ckf;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class CellList extends ArrayList<BaseCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int indexCount;

    static {
        t2o.a(993001482);
    }

    public CellList(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(CellList cellList, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1738987735:
                return new Integer(super.lastIndexOf(objArr[0]));
            case -1530880303:
                return new Boolean(super.addAll(((Number) objArr[0]).intValue(), (Collection) objArr[1]));
            case -1335065210:
                return new Boolean(super.contains(objArr[0]));
            case -1272099756:
                super.clear();
                return null;
            case -475350822:
                return cellList.remove(((Number) objArr[0]).intValue());
            case -332530133:
                return new Boolean(super.remove(objArr[0]));
            case 195222152:
                return new Boolean(super.add((CellList) objArr[0]));
            case 845773819:
                return new Integer(super.size());
            case 1580890655:
                return new Integer(super.indexOf(objArr[0]));
            case 1730268220:
                return new Boolean(super.addAll((Collection) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/data/CellList");
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends BaseCellBean> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        for (BaseCellBean baseCellBean : collection) {
            int i = this.indexCount;
            this.indexCount = i + 1;
            baseCellBean.comboRealIndex = i;
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        this.indexCount = 0;
    }

    public /* bridge */ boolean contains(BaseCellBean baseCellBean) {
        return super.contains((Object) baseCellBean);
    }

    public final int getIndexCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18da464d", new Object[]{this})).intValue();
        }
        return this.indexCount;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(BaseCellBean baseCellBean) {
        return super.indexOf((Object) baseCellBean);
    }

    public /* bridge */ int lastIndexOf(BaseCellBean baseCellBean) {
        return super.lastIndexOf((Object) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ BaseCellBean remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ BaseCellBean removeAt(int i) {
        return remove(i);
    }

    public final void setIndexCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3945915d", new Object[]{this, new Integer(i)});
        } else {
            this.indexCount = i;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public CellList() {
    }

    public boolean add(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7624f7e", new Object[]{this, baseCellBean})).booleanValue();
        }
        ckf.g(baseCellBean, "element");
        int i = this.indexCount;
        this.indexCount = 1 + i;
        baseCellBean.comboRealIndex = i;
        return super.add((CellList) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return false;
        }
        return contains((BaseCellBean) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return -1;
        }
        return indexOf((BaseCellBean) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return -1;
        }
        return lastIndexOf((BaseCellBean) obj);
    }

    public /* bridge */ boolean remove(BaseCellBean baseCellBean) {
        return super.remove((Object) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return false;
        }
        return remove((BaseCellBean) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends BaseCellBean> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c09ed1", new Object[]{this, new Integer(i), collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        for (BaseCellBean baseCellBean : collection) {
            int i2 = this.indexCount;
            this.indexCount = i2 + 1;
            baseCellBean.comboRealIndex = i2;
        }
        return super.addAll(i, collection);
    }
}
