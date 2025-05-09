package com.taobao.android.dinamic.expressionv2;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.DinamicASTNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tb.bn7;
import tb.em7;
import tb.im7;
import tb.jn7;
import tb.km7;
import tb.nm7;
import tb.t2o;
import tb.tl7;
import tb.ym7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List e;

    static {
        t2o.a(444596305);
    }

    public d() {
        this.f7260a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod;
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/DinamicMethodNode");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9bc31d", new Object[]{this});
            return;
        }
        this.e = new ArrayList();
        int size = ((LinkedList) this.b).size();
        for (int i = 0; i < size; i++) {
            this.e.add(((DinamicASTNode) ((LinkedList) this.b).get(i)).c());
        }
    }

    public List e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4fdbb875", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.android.dinamic.expressionv2.DinamicASTNode
    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int size = ((LinkedList) this.b).size();
        for (int i = 0; i < size; i++) {
            Object c = ((DinamicASTNode) ((LinkedList) this.b).get(i)).c();
            if (c != null) {
                arrayList.add(c);
            } else {
                arrayList.add(em7.NL);
            }
        }
        String str = this.d;
        im7 b = str != null ? km7.b(str) : null;
        ym7.h("MethodName:" + this.d);
        if (b == null) {
            return null;
        }
        try {
            ym7.h("args:" + arrayList.toString());
            return b.a(arrayList, (bn7) this.c);
        } catch (Throwable th) {
            ym7.l("DinamicExpresstion", th, "parse express failed, parser=", b.getClass().getName());
            return null;
        }
    }

    public void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed003759", new Object[]{this, view});
            return;
        }
        ym7.m("DinamicExpression handleEvent", new String[0]);
        if (this.b != null) {
            ArrayList arrayList = new ArrayList();
            int size = ((LinkedList) this.b).size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((DinamicASTNode) ((LinkedList) this.b).get(i)).c());
            }
            String str = this.d;
            nm7 b = str != null ? tl7.b(str) : null;
            if (b != null) {
                try {
                    bn7 bn7Var = (bn7) this.c;
                    b.a(view, bn7Var.c(), arrayList, bn7Var.d(), bn7Var.b(), (ArrayList) view.getTag(jn7.VIEW_PARAMS));
                } catch (Throwable th) {
                    ym7.l("DinamicExpression", th, "parse express failed, parser=", b.getClass().getName());
                }
            }
        }
    }
}
