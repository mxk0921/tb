package com.taobao.search.sf.widgets.list.listcell.inshopauction2020;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellBean;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InshopAuction2020CellBean extends InshopAuctionCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<String> skuPics;
    private int topIconHeight;
    private int topIconLeft;
    private int topIconTop;
    private String topIconUrl;
    private int topIconWidth;

    static {
        t2o.a(815793643);
    }

    public static /* synthetic */ Object ipc$super(InshopAuction2020CellBean inshopAuction2020CellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/inshopauction2020/InshopAuction2020CellBean");
    }

    public final ArrayList<String> getSkuPics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("55f9e591", new Object[]{this});
        }
        return this.skuPics;
    }

    public final int getTopIconHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3355b79", new Object[]{this})).intValue();
        }
        return this.topIconHeight;
    }

    public final int getTopIconLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5d97059", new Object[]{this})).intValue();
        }
        return this.topIconLeft;
    }

    public final int getTopIconTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8dfa0f7", new Object[]{this})).intValue();
        }
        return this.topIconTop;
    }

    public final String getTopIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc376c42", new Object[]{this});
        }
        return this.topIconUrl;
    }

    public final int getTopIconWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d31a2e8", new Object[]{this})).intValue();
        }
        return this.topIconWidth;
    }

    public final void setSkuPics(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6486cbdf", new Object[]{this, arrayList});
        } else {
            this.skuPics = arrayList;
        }
    }

    public final void setTopIconHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa20a49", new Object[]{this, new Integer(i)});
        } else {
            this.topIconHeight = i;
        }
    }

    public final void setTopIconLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a951a469", new Object[]{this, new Integer(i)});
        } else {
            this.topIconLeft = i;
        }
    }

    public final void setTopIconTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49eb8bf3", new Object[]{this, new Integer(i)});
        } else {
            this.topIconTop = i;
        }
    }

    public final void setTopIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319fa374", new Object[]{this, str});
        } else {
            this.topIconUrl = str;
        }
    }

    public final void setTopIconWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4993b22", new Object[]{this, new Integer(i)});
        } else {
            this.topIconWidth = i;
        }
    }
}
