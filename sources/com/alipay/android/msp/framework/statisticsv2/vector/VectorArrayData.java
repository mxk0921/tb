package com.alipay.android.msp.framework.statisticsv2.vector;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VectorArrayData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Vector f3671a;
    public final ArrayList<IModel> b = new ArrayList<>();

    public VectorArrayData(Vector vector, int i) {
        this.f3671a = vector;
    }

    public static boolean isEmpty(VectorArrayData vectorArrayData) {
        ArrayList<IModel> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bad875a6", new Object[]{vectorArrayData})).booleanValue();
        }
        if (vectorArrayData == null || (arrayList = vectorArrayData.b) == null || arrayList.size() == 0) {
            return true;
        }
        return false;
    }

    public final String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        StringBuilder sb = new StringBuilder();
        String[] attrs = this.f3671a.getAttrs();
        for (String str : attrs) {
            String filter = Grammar.filter(map.get(str));
            if (TextUtils.isEmpty(filter)) {
                filter = Grammar.ATTR_DEFAULT_VALUE;
            }
            sb.append(filter);
            sb.append(Grammar.FIELD_SEPARATOR[0]);
        }
        if (attrs.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public synchronized int add(IModel iModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b030b0e1", new Object[]{this, iModel})).intValue();
        } else if (iModel == null) {
            return -1;
        } else {
            this.b.add(iModel);
            return this.b.indexOf(iModel);
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30d19e71", new Object[]{this});
        }
        if (this.f3671a == Vector.Biz) {
            return "@@biz@@";
        }
        return "";
    }

    public synchronized String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Grammar.CONTAINER_START[0]);
        sb.append(b());
        Iterator<IModel> it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(a(it.next().toMap()));
            sb.append(Grammar.CONTAINER_ARRAY_SEPARATOR[0]);
        }
        if (!this.b.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        } else if (TextUtils.isEmpty(b())) {
            sb.append(Grammar.ATTR_DEFAULT_VALUE);
        }
        sb.append(Grammar.CONTAINER_END[0]);
        return sb.toString();
    }

    public IModel get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IModel) ipChange.ipc$dispatch("fdba1cd6", new Object[]{this, new Integer(i)});
        }
        return this.b.get(i);
    }
}
