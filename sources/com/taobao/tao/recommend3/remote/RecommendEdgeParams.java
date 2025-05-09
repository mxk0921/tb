package com.taobao.tao.recommend3.remote;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendEdgeParams implements IMTOPDataObject, Serializable {
    public String containerParams;
    public String countryCode;
    public String edition;
    public String encryptUserId;
    public String gatewayVersion;
    public String nick;
    public String userId;
    public String utdid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12662a;
        public String b = "";
        public String c = "";
        public String d = "";
        public String e = "";
        public String f = "";
        public String g = "";
        public String h = "";
        public String i = "";

        static {
            t2o.a(729809871);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3f2130bf", new Object[]{bVar});
            }
            return bVar.f12662a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("84c2735e", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca63b5fd", new Object[]{bVar});
            }
            return bVar.g;
        }

        public RecommendEdgeParams d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecommendEdgeParams) ipChange.ipc$dispatch("b5c56a42", new Object[]{this});
            }
            RecommendEdgeParams recommendEdgeParams = new RecommendEdgeParams(this);
            recommendEdgeParams.countryCode = this.e;
            recommendEdgeParams.edition = this.f;
            recommendEdgeParams.encryptUserId = this.d;
            recommendEdgeParams.nick = this.b;
            recommendEdgeParams.utdid = this.c;
            recommendEdgeParams.userId = this.i;
            return recommendEdgeParams;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7c433199", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("927ced12", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eeb09943", new Object[]{this, str});
            }
            this.f12662a = str;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4ac36d17", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("79b1142a", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b107c646", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("991b338c", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4cd87003", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("74fab95", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }
    }

    static {
        t2o.a(729809869);
        t2o.a(589299906);
    }

    private RecommendEdgeParams(b bVar) {
        this.nick = "";
        this.userId = "";
        this.utdid = "";
        this.encryptUserId = "";
        this.countryCode = "";
        this.edition = "";
        this.containerParams = "";
        this.gatewayVersion = "2.0";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("requestInfo", (Object) b.a(bVar));
        jSONObject2.put("requestType", (Object) b.b(bVar));
        jSONObject2.put("bizParams", (Object) jSONObject3);
        jSONObject.put(b.c(bVar), (Object) jSONObject2);
        this.containerParams = jSONObject.toJSONString();
    }
}
