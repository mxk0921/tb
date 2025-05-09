package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Sa;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class Ra implements Sa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BxData.OpConfItemValue f2570a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$a");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            if (parseArray == null) {
                i = 0;
            } else {
                i = parseArray.size();
            }
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, Integer.valueOf(i), false));
            }
            sa.a(String.valueOf(i));
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$b");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            list.add(new BxData.OpResult(this.f2570a.name, str, true));
            sa.a(str2);
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$f");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            Collections.reverse(parseArray);
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, parseArray, false));
            }
            sa.a(JsonUtils.toJSONString(parseArray));
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class g extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$g");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            String str3;
            Collection collection;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            Map map = (Map) JsonUtils.parseObject(this.f2570a.input, (Class<Object>) Map.class);
            ArrayList arrayList = new ArrayList();
            if (map == null) {
                str3 = "";
            } else {
                str3 = (String) map.get("sep");
            }
            if (TextUtils.isEmpty(str3) || !str2.contains(str3)) {
                arrayList.add(str2);
                collection = arrayList;
            } else {
                collection = Arrays.asList(str2.split(str3));
            }
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, collection, false));
            }
            sa.a(JsonUtils.toJSONString(collection));
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class h extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$h");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            Map map = (Map) JsonUtils.parseObject(str2, (Class<Object>) Map.class);
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, map, false));
            }
            sa.a(JsonUtils.toJSONString(map));
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class i extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$i");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                String str3 = opConfItemValue.name;
                if (TextUtils.isEmpty(str2)) {
                    d = vu3.b.GEO_NOT_SUPPORT;
                } else {
                    d = Double.parseDouble(str2);
                }
                list.add(new BxData.OpResult(str3, Double.valueOf(d), false));
            }
            sa.a(str2);
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class j extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$j");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, parseArray, false));
            }
            sa.a(JsonUtils.toJSONString(parseArray));
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class k extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$k");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                String str3 = opConfItemValue.name;
                if (TextUtils.isEmpty(str2)) {
                    j = 0;
                } else {
                    j = Long.parseLong(str2);
                }
                list.add(new BxData.OpResult(str3, Long.valueOf(j), false));
            }
            sa.a(str2);
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class l extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$l");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            Collection parseArray = JSON.parseArray(str2, String.class);
            if (parseArray == null) {
                parseArray = new ArrayList();
            }
            ArrayList arrayList = new ArrayList(new HashSet(parseArray));
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, arrayList, false));
            }
            sa.a(JsonUtils.toJSONString(arrayList));
            return sa.b();
        }
    }

    public Ra(BxData.OpConfItemValue opConfItemValue) {
        this.f2570a = opConfItemValue;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c2 : str.toCharArray()) {
            if (!Character.isDigit(c2)) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
            if (r2.equals("reserveList") == false) goto L_0x0022;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.alibaba.security.ccrc.service.build.Ra a(com.alibaba.security.wukong.bx.algo.BxData.OpConfItemValue r5) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.Ra.c.a(com.alibaba.security.wukong.bx.algo.BxData$OpConfItemValue):com.alibaba.security.ccrc.service.build.Ra");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$e");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            Map map = (Map) JsonUtils.parseObject(this.f2570a.input, (Class<Object>) Map.class);
            String str3 = "";
            String str4 = map == null ? str3 : (String) map.get("sep");
            if (TextUtils.isEmpty(str4) || parseArray == null || parseArray.isEmpty()) {
                str3 = null;
            } else {
                int size = parseArray.size();
                Iterator it = parseArray.iterator();
                int i = 0;
                while (it.hasNext()) {
                    str3 = str3 + ((String) it.next());
                    if (i < size - 1) {
                        str3 = str3 + str4;
                    }
                    i++;
                }
            }
            BxData.OpConfItemValue opConfItemValue = this.f2570a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, str3, false));
            }
            sa.a(str3);
            return sa.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d extends Ra {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ra$d");
        }

        @Override // com.alibaba.security.ccrc.service.build.Sa.a
        public Object a(String str, String str2, List<BxData.OpResult> list, Sa sa) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fb82186f", new Object[]{this, str, str2, list, sa});
            }
            List<Object> parseArray = JSON.parseArray(str2, Object.class);
            if (parseArray == null) {
                parseArray = new ArrayList<>();
            }
            Map map = (Map) JsonUtils.parseObject(this.f2570a.input, (Class<Object>) Map.class);
            Object a2 = a(parseArray, map == null ? 0 : ((Integer) map.get("type")).intValue());
            if (a2 != null) {
                BxData.OpConfItemValue opConfItemValue = this.f2570a;
                if (opConfItemValue.isKey) {
                    list.add(new BxData.OpResult(opConfItemValue.name, a2, false));
                }
                sa.a(JsonUtils.toJSONString(a2));
            }
            return sa.b();
        }

        private Object a(List<Object> list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e6698fa8", new Object[]{this, list, new Integer(i)});
            }
            if (list.size() == 0) {
                return null;
            }
            if (i == 1) {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (a(str)) {
                        arrayList.add(Long.valueOf(Long.parseLong(str)));
                    }
                }
                return arrayList;
            } else if (i != 2) {
                return null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<Object> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!a(str2)) {
                        arrayList2.add(str2);
                    }
                }
                return arrayList2;
            }
        }
    }
}
