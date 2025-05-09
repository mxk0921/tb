package com.taobao.android.weex_ability.mtop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.p6p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a b = new a();

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0516a f9943a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_ability.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0516a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f9944a = null;
        public c b;

        static {
            t2o.a(980418636);
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("39ce6491", new Object[]{this});
            }
            return this.b;
        }

        public void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49397411", new Object[]{this, cVar});
            } else {
                this.b = cVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(JSONObject jSONObject);
    }

    static {
        t2o.a(980418634);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b4f5409", new Object[0]);
        }
        return b;
    }

    public b b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("57effe20", new Object[]{this, str, jSONObject});
        }
        AbstractC0516a aVar = this.f9943a;
        if (aVar != null) {
            return ((p6p) aVar).c(str, jSONObject);
        }
        return null;
    }

    public void c(AbstractC0516a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34af3fc", new Object[]{this, aVar});
        } else {
            this.f9943a = aVar;
        }
    }
}
