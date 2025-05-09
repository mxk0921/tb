package com.taobao.search.sf.widgets.preposefilter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.aum;
import tb.ckf;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PreposeFilterBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<aum> buttonList;
    public List<String> multiValueKeys;
    private boolean refreshAll;
    public Map<String, String> traceMap;

    static {
        t2o.a(815793748);
    }

    public static /* synthetic */ Object ipc$super(PreposeFilterBean preposeFilterBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/preposefilter/PreposeFilterBean");
    }

    public final ArrayList<aum> getButtonList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2f9327c7", new Object[]{this});
        }
        ArrayList<aum> arrayList = this.buttonList;
        if (arrayList != null) {
            return arrayList;
        }
        ckf.y("buttonList");
        throw null;
    }

    public final List<String> getMultiValueKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e13d08de", new Object[]{this});
        }
        List<String> list = this.multiValueKeys;
        if (list != null) {
            return list;
        }
        ckf.y(r4p.KEY_MULTI_VALUE_KEYS);
        throw null;
    }

    public final boolean getRefreshAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a63b47", new Object[]{this})).booleanValue();
        }
        return this.refreshAll;
    }

    public final Map<String, String> getTraceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8f167c89", new Object[]{this});
        }
        Map<String, String> map = this.traceMap;
        if (map != null) {
            return map;
        }
        ckf.y("traceMap");
        throw null;
    }

    public final void setButtonList(ArrayList<aum> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcc2ad1", new Object[]{this, arrayList});
            return;
        }
        ckf.g(arrayList, "<set-?>");
        this.buttonList = arrayList;
    }

    public final void setMultiValueKeys(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc1346", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.multiValueKeys = list;
    }

    public final void setRefreshAll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f87965", new Object[]{this, new Boolean(z)});
        } else {
            this.refreshAll = z;
        }
    }

    public final void setTraceMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5392c725", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.traceMap = map;
    }
}
