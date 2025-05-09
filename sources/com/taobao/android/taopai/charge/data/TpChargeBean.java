package com.taobao.android.taopai.charge.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.act;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TpChargeBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String billId;
    private String bizLine;
    private String bizScene;
    private Map<String, String> detailMap;
    private final Map<String, String> extendMap;
    private String funId;
    private List<String> materialIdList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9531a;
        public Map<String, String> b = new HashMap();
        public final List<String> c = new ArrayList();
        public String d = act.b();
        public String e = act.c();

        static {
            t2o.a(782237702);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5577f681", new Object[]{bVar});
            }
            return bVar.f9531a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d7754e0", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e576b33f", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ Map d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ed1d45f7", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ List e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e53280e4", new Object[]{bVar});
            }
            return bVar.c;
        }

        public b f(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("587fdfa5", new Object[]{this, list});
            }
            if (list != null) {
                ((ArrayList) this.c).addAll(list);
                return this;
            }
            throw new IllegalArgumentException("params is null");
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fd58ba77", new Object[]{this, str});
            }
            ((ArrayList) this.c).add(str);
            return this;
        }

        public TpChargeBean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TpChargeBean) ipChange.ipc$dispatch("b109f80", new Object[]{this});
            }
            if (!TextUtils.isEmpty(this.f9531a)) {
                return new TpChargeBean(this);
            }
            throw new IllegalArgumentException("funId is null");
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dd526c28", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("86718e12", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1691182e", new Object[]{this, str});
            }
            this.b.put("compositeAmount", str);
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2ae194fc", new Object[]{this, str});
            }
            this.b.put("contentType", str);
            return this;
        }

        public b m(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6c357a09", new Object[]{this, map});
            }
            this.b = map;
            return this;
        }

        public b n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("63eb99b5", new Object[]{this, str});
            }
            this.f9531a = str;
            return this;
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("58b9dfab", new Object[]{this, str});
            }
            this.b.put("toolCount", str);
            return this;
        }
    }

    static {
        t2o.a(782237700);
    }

    public String getBillId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba747f81", new Object[]{this});
        }
        return this.billId;
    }

    public String getBizLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26095428", new Object[]{this});
        }
        return this.bizLine;
    }

    public String getBizScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this});
        }
        return this.bizScene;
    }

    public Map<String, String> getDetailMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("719cdbd1", new Object[]{this});
        }
        return this.detailMap;
    }

    public Map<String, String> getExtendMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fcdf7ca8", new Object[]{this});
        }
        return this.extendMap;
    }

    public String getFunId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a308835", new Object[]{this});
        }
        return this.funId;
    }

    public List<String> getMaterialIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79f8a1ca", new Object[]{this});
        }
        return this.materialIdList;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (this.materialIdList != null) {
            sb.append("materialIdList = ");
            Iterator<String> it = this.materialIdList.iterator();
            while (it.hasNext()) {
                sb.append(it.next() + "; ");
            }
        }
        if (this.materialIdList != null) {
            sb.append("materialIdList = ");
            Iterator<String> it2 = this.materialIdList.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next() + "; ");
            }
        }
        if (this.detailMap != null) {
            sb.append("detailMap = ");
            for (String str : this.detailMap.keySet()) {
                sb.append(str + " = " + this.detailMap.get(str) + ";");
            }
        }
        if (this.extendMap != null) {
            sb.append("extendMap = ");
            for (String str2 : this.extendMap.keySet()) {
                sb.append(str2 + " = " + this.extendMap.get(str2) + ";");
            }
        }
        return "billId='" + this.billId + "', funId='" + this.funId + "', bizLine='" + this.bizLine + "', bizScene='" + this.bizScene + '\'' + sb.toString() + '}';
    }

    public TpChargeBean() {
        this.extendMap = new HashMap();
    }

    private TpChargeBean(b bVar) {
        this.extendMap = new HashMap();
        this.billId = act.d();
        this.funId = b.a(bVar);
        this.bizLine = b.b(bVar);
        this.bizScene = b.c(bVar);
        this.detailMap = b.d(bVar);
        this.materialIdList = b.e(bVar);
    }
}
