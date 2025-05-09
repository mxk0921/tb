package com.taobao.taolive.sdk.business;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TextMessage;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import tb.b0d;
import tb.bwd;
import tb.cap;
import tb.cbp;
import tb.cwd;
import tb.joc;
import tb.kod;
import tb.m29;
import tb.qvs;
import tb.t2o;
import tb.v2s;
import tb.zvd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InteractBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bwd f13269a;
    public cap b;
    public m29 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13270a;

        public a(kod kodVar, int i) {
            this.f13270a = i;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            cwd A = v2s.o().A();
            A.b(cwd.LOG_TAG, "Message: send msg error type " + this.f13270a);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            cwd A = v2s.o().A();
            A.b(cwd.LOG_TAG, "Message: send msg success type " + this.f13270a);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13271a;

        public b(kod kodVar, int i) {
            this.f13271a = i;
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else if (i == 1000) {
                cwd A = v2s.o().A();
                A.b(cwd.LOG_TAG, "Message: send msg success type " + this.f13271a);
            } else {
                cwd A2 = v2s.o().A();
                A2.b(cwd.LOG_TAG, "Message: send msg error type " + this.f13271a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(InteractBusiness interactBusiness) {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else if (i == 1000) {
                v2s.o().A().b(cwd.LOG_TAG, "Message: send msg: sendMessage SUCCESS");
            } else {
                v2s.o().A().b(cwd.LOG_TAG, "Message: send msg: sendMessage FAIL");
            }
        }
    }

    static {
        t2o.a(806355976);
    }

    public InteractBusiness(bwd bwdVar) {
        this.f13269a = bwdVar;
    }

    public static void l(String str, String str2, String str3, int i, String str4, String[] strArr, kod kodVar, bwd bwdVar) {
        byte[] bytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954e9838", new Object[]{str, str2, str3, new Integer(i), str4, strArr, kodVar, bwdVar});
        } else if (!qvs.V() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !qvs.W().contains(Integer.valueOf(i))) {
            TLiveMsg tLiveMsg = new TLiveMsg();
            tLiveMsg.topic = str3;
            tLiveMsg.bizCode = 1;
            tLiveMsg.type = i;
            tLiveMsg.tags = strArr;
            joc u = v2s.o().u();
            if (u != null) {
                tLiveMsg.from = u.getNick();
            }
            if (str4 != null) {
                try {
                    bytes = str4.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } else {
                bytes = null;
            }
            tLiveMsg.data = bytes;
            if (bwdVar != null) {
                bwdVar.i(1, tLiveMsg, new b(kodVar, i), new Object[0]);
            }
            cwd A = v2s.o().A();
            A.b(cwd.LOG_TAG, "Message: send msg: roomId---" + str3 + "  content---" + str4);
        } else {
            new cbp(new a(kodVar, i)).K(str, str2, str3, String.valueOf(i), str4);
        }
    }

    public void a(String str, long j, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a77607", new Object[]{this, str, new Long(j), zvdVar});
            return;
        }
        bwd bwdVar = this.f13269a;
        if (bwdVar != null) {
            bwdVar.f(1, str, new HashMap<String, Double>(j) { // from class: com.taobao.taolive.sdk.business.InteractBusiness.4
                public final /* synthetic */ long val$count;

                {
                    this.val$count = j;
                    put(PowerMsgType.KEY_FAVOR, Double.valueOf(j));
                }
            }, false, zvdVar, new Object[0]);
        }
    }

    public void b(long j, long j2, String str, b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33bc531", new Object[]{this, new Long(j), new Long(j2), str, b0dVar});
            return;
        }
        if (this.c == null) {
            this.c = new m29(b0dVar);
        }
        this.c.K(j, j2, str, null, null);
    }

    public void c(long j, long j2, String str, b0d b0dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745eee34", new Object[]{this, new Long(j), new Long(j2), str, b0dVar, map});
            return;
        }
        if (this.c == null) {
            this.c = new m29(b0dVar);
        }
        this.c.K(j, j2, str, null, map);
    }

    public void d(long j, long j2, String str, String str2, b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e36b0", new Object[]{this, new Long(j), new Long(j2), str, str2, b0dVar});
            return;
        }
        if (this.c == null) {
            this.c = new m29(b0dVar);
        }
        this.c.K(j, j2, str, str2, null);
    }

    public void e(long j, long j2, String str, String str2, b0d b0dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c596ed5", new Object[]{this, new Long(j), new Long(j2), str, str2, b0dVar, map});
            return;
        }
        if (this.c == null) {
            this.c = new m29(b0dVar);
        }
        this.c.K(j, j2, str, str2, map);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        m29 m29Var = this.c;
        if (m29Var != null) {
            m29Var.destroy();
        }
        cap capVar = this.b;
        if (capVar != null) {
            capVar.destroy();
        }
        this.f13269a = null;
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b42f67a", new Object[]{this, str, str2});
            return;
        }
        TextMessage textMessage = new TextMessage();
        textMessage.message = str2;
        TLiveMsg tLiveMsg = new TLiveMsg();
        tLiveMsg.type = 101;
        tLiveMsg.bizCode = 1;
        tLiveMsg.topic = str;
        try {
            tLiveMsg.data = JSON.toJSONString(textMessage).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        joc u = v2s.o().u();
        if (u != null) {
            tLiveMsg.from = u.getNick();
            bwd bwdVar = this.f13269a;
            if (bwdVar != null) {
                bwdVar.n(1, tLiveMsg, new c(this), new Object[0]);
                cwd A = v2s.o().A();
                A.b(cwd.LOG_TAG, "Message: send msg: roomId---" + str + "  content---" + str2);
            }
        }
    }

    public void j(String str, String str2, String str3, HashMap<String, String> hashMap, b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada3946b", new Object[]{this, str, str2, str3, hashMap, b0dVar});
            return;
        }
        if (this.b == null) {
            this.b = new cap(b0dVar);
        }
        this.b.M(str, str2, str3, hashMap);
    }
}
