package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.FamilyManager;
import com.taobao.family.FamilyMember;
import com.taobao.family.globalbubble.GlobalWindowFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ch0 extends dv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ArrayList<FamilyMember> r = new ArrayList<>();
    public HashMap<String, String> s = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements xqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xqk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24e8fe54", new Object[]{this});
            } else {
                ch0.H(ch0.this).clear();
            }
        }
    }

    public ch0(Context context, boolean z, int i) {
        super(context, z, i);
        O();
        P();
    }

    public static /* synthetic */ ArrayList H(ch0 ch0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("27cd4f9e", new Object[]{ch0Var});
        }
        return ch0Var.r;
    }

    public static /* synthetic */ HashMap I(ch0 ch0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3af58728", new Object[]{ch0Var});
        }
        return ch0Var.s;
    }

    public static /* synthetic */ HashMap J(ch0 ch0Var, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bce160af", new Object[]{ch0Var, hashMap});
        }
        ch0Var.s = hashMap;
        return hashMap;
    }

    public static /* synthetic */ epo K(ch0 ch0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epo) ipChange.ipc$dispatch("dd1efb26", new Object[]{ch0Var});
        }
        return ch0Var.b;
    }

    public static /* synthetic */ void L(ch0 ch0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78560f87", new Object[]{ch0Var});
        } else {
            ch0Var.Q();
        }
    }

    public static /* synthetic */ epo M(ch0 ch0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epo) ipChange.ipc$dispatch("63ebd9a8", new Object[]{ch0Var});
        }
        return ch0Var.b;
    }

    public static /* synthetic */ Object ipc$super(ch0 ch0Var, String str, Object... objArr) {
        if (str.hashCode() == -81335666) {
            return new Boolean(super.B());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/globalbubble/affection/AffectionGlobalWindow");
    }

    @Override // tb.dv1
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3778936", new Object[]{this});
            return;
        }
        y7t.a(v(), "sendInitMessage");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userList", this.r);
        E("gbGlobalQqhRelationChanged", hashMap);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        for (String str : this.s.keySet()) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("userId", str);
            hashMap3.put("msgCount", this.s.get(str));
            arrayList.add(hashMap3);
        }
        hashMap2.put("msgList", arrayList);
        E("gbGlobalNoticeChanged", hashMap2);
    }

    public final synchronized void N(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b94bec7", new Object[]{this, map});
        } else if (this.s != null) {
            String str = (String) map.get("userId");
            String str2 = (String) map.get("msgCount");
            if (!TextUtils.isEmpty(str) && this.s.containsKey(str)) {
                this.s.put(str, str2);
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            ArrayList arrayList = new ArrayList();
            for (String str3 : this.s.keySet()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("userId", str);
                hashMap2.put("msgCount", str2);
                arrayList.add(hashMap2);
            }
            hashMap.put("msgList", arrayList);
            E("gbGlobalNoticeChanged", hashMap);
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff3b0c8", new Object[]{this});
        } else {
            FamilyManager.registerBubbleDisplayListener(new a());
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fd2889", new Object[]{this});
        } else {
            this.m.j(new b());
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a29462", new Object[]{this});
        } else {
            this.m.i(new ArrayList(this.r));
        }
    }

    @Override // tb.dv1, tb.dac
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d335924c", new Object[]{this, str, map});
        } else if (this.d != null) {
            int hashCode = str.hashCode();
            if (hashCode != -554827229) {
                if (hashCode == -55969654) {
                    str.equals(GlobalWindowFactory.EVENT_LOCATION_RESET);
                }
            } else if (str.equals(GlobalWindowFactory.EVENT_AMP_CONVERSATION)) {
                N(map);
            }
        }
    }

    @Override // tb.dv1
    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab0b021f", new Object[]{this});
        }
        return "family_bubble";
    }

    @Override // tb.dv1
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a171b2b", new Object[]{this});
        }
        return "FamilyBubble";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements sm2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.sm2
        public void b(List<FamilyMember> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("396daff5", new Object[]{this, list});
            } else {
                ch0.this.v();
            }
        }

        @Override // tb.sm2
        public void a(List<FamilyMember> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17b0ecef", new Object[]{this, list});
            } else if (list != null) {
                synchronized (ch0.this) {
                    try {
                        ch0.H(ch0.this).clear();
                        ch0.H(ch0.this).addAll(list);
                        HashMap hashMap = new HashMap();
                        Iterator it = ch0.H(ch0.this).iterator();
                        while (it.hasNext()) {
                            FamilyMember familyMember = (FamilyMember) it.next();
                            String str = (String) ch0.I(ch0.this).get(familyMember.userId);
                            if (TextUtils.isEmpty(str)) {
                                hashMap.put(familyMember.userId, "0");
                            } else {
                                hashMap.put(familyMember.userId, str);
                            }
                        }
                        ch0.J(ch0.this, hashMap);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                StringBuilder sb = new StringBuilder("Size:" + list.size());
                for (FamilyMember familyMember2 : list) {
                    sb.append("userId:");
                    sb.append(familyMember2.userId);
                    sb.append("reloId:");
                    sb.append(familyMember2.relationName);
                }
                ch0.this.v();
                if (list.size() > 0) {
                    ch0.K(ch0.this).sendEmptyMessage(1);
                    ch0.this.F();
                    ch0.L(ch0.this);
                    return;
                }
                ch0.M(ch0.this).sendEmptyMessage(2);
            }
        }
    }

    @Override // tb.dv1
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb26ea8e", new Object[]{this})).booleanValue();
        }
        if (super.B()) {
            return true;
        }
        try {
            String v = v();
            StringBuilder sb = new StringBuilder("preShow:");
            sb.append(isShowing());
            sb.append(String.valueOf(this.r.size() == 0));
            sb.append(String.valueOf(!this.i));
            y7t.a(v, sb.toString());
        } catch (OutOfMemoryError unused) {
        }
        return yca.p().t(GlobalWindowFactory.WINDOW_SHAREBACK) || this.r.size() == 0;
    }
}
