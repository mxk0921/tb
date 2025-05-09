package com.taobao.search.searchdoor.searchbar.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.h19;
import tb.ire;
import tb.jlt;
import tb.mv1;
import tb.pre;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchBarHintStructuredBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private List<mv1> infoList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793077);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final SearchBarHintStructuredBean a(JSONObject jSONObject) {
            JSONArray c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchBarHintStructuredBean) ipChange.ipc$dispatch("e86469b1", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty() || (c = h19.c(jSONObject, "infoList")) == null || c.isEmpty()) {
                return null;
            }
            SearchBarHintStructuredBean searchBarHintStructuredBean = new SearchBarHintStructuredBean();
            searchBarHintStructuredBean.setInfoList(new ArrayList());
            int size = c.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                String i2 = h19.i(jSONObject2, "type", "");
                if (ckf.b("image", i2)) {
                    ire a2 = ire.Companion.a(jSONObject2);
                    if (a2 != null) {
                        List<mv1> infoList = searchBarHintStructuredBean.getInfoList();
                        ckf.d(infoList);
                        infoList.add(a2);
                    }
                } else if (ckf.b(mv1.TYPE_IMAGE_TEXT, i2)) {
                    pre a3 = pre.Companion.a(jSONObject2);
                    if (a3 != null) {
                        List<mv1> infoList2 = searchBarHintStructuredBean.getInfoList();
                        ckf.d(infoList2);
                        infoList2.add(a3);
                    }
                } else {
                    jlt a4 = jlt.Companion.a(jSONObject2);
                    if (a4 != null) {
                        List<mv1> infoList3 = searchBarHintStructuredBean.getInfoList();
                        ckf.d(infoList3);
                        infoList3.add(a4);
                    }
                }
            }
            List<mv1> infoList4 = searchBarHintStructuredBean.getInfoList();
            ckf.d(infoList4);
            if (infoList4.isEmpty()) {
                return null;
            }
            return searchBarHintStructuredBean;
        }
    }

    static {
        t2o.a(815793076);
    }

    @JvmStatic
    public static final SearchBarHintStructuredBean parseStructuredInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintStructuredBean) ipChange.ipc$dispatch("e86469b1", new Object[]{jSONObject});
        }
        return Companion.a(jSONObject);
    }

    public final List<mv1> getInfoList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("33e2efbe", new Object[]{this});
        }
        return this.infoList;
    }

    public final void setInfoList(List<mv1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1e8166", new Object[]{this, list});
        } else {
            this.infoList = list;
        }
    }
}
