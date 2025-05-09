package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class msl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24274a;
    public final Map<String, Pattern> b;
    public final Map<String, Pattern> c;
    public final Map<String, Pattern> d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final msl f24275a = new msl();

        static {
            t2o.a(665845847);
        }

        public static /* synthetic */ msl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (msl) ipChange.ipc$dispatch("795a25d7", new Object[0]);
            }
            return f24275a;
        }
    }

    static {
        t2o.a(665845845);
    }

    public static msl c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (msl) ipChange.ipc$dispatch("f965f49c", new Object[0]);
        }
        return b.a();
    }

    public List<String> a(String str) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("889daa03", new Object[]{this, str});
        }
        try {
            arrayList = new ArrayList();
        } catch (Throwable unused) {
        }
        if (!e()) {
            arrayList.add(str);
            return arrayList;
        }
        List<apl<String, String>> j = j(str);
        if (j == null || j.size() == 0) {
            j = k(str);
        }
        if (!(j == null || j.size() == 0)) {
            for (apl<String, String> aplVar : j) {
                arrayList.add(aplVar.a());
            }
            fwr.a(this.f24274a + ":listStr append:", arrayList.toString());
            if (!f()) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(b((String) it.next()));
            }
            return arrayList2;
        }
        return null;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9231d9da", new Object[]{this, str});
        }
        if (h()) {
            return l(str);
        }
        return i(str);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(this.j, this.k, this.e);
        String config2 = OrangeConfig.getInstance().getConfig(this.j, this.m, this.f);
        String config3 = OrangeConfig.getInstance().getConfig(this.j, this.l, this.g);
        this.i = OrangeConfig.getInstance().getConfig(this.j, this.n, this.h);
        this.b.put("A", Pattern.compile(config3));
        this.c.put("B", Pattern.compile(config));
        this.d.put("B", Pattern.compile(config2));
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcf3041d", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.o, "true"));
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b79247d", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.q, "false"));
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34dda55a", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.p, "true"));
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e47d73d", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.r, "false"));
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("991d9903", new Object[]{this, str});
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public List<apl<String, String>> j(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e657dc5", new Object[]{this, str});
        }
        String str3 = this.f24274a + ":parserStrategyATaoPasswordKey:";
        String str4 = "";
        if (str != null) {
            str2 = str;
        } else {
            str2 = str4;
        }
        fwr.a(str3, str2);
        String str5 = this.f24274a + ":parserStrategyATaoPasswordKey regxPatternPlanAMap:";
        Map<String, Pattern> map = this.b;
        if (map != null) {
            str4 = map.toString();
        }
        fwr.a(str5, str4);
        if (g()) {
            str = str.replaceAll(this.i, " ");
            fwr.a(this.f24274a + ":parserStrategyATaoPasswordKey phoneRegex replace:", str);
        }
        ArrayList arrayList = new ArrayList();
        if (((ConcurrentHashMap) this.b).size() > 0) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                if (entry.getValue() != null) {
                    Matcher matcher = ((Pattern) entry.getValue()).matcher(str);
                    while (matcher.find()) {
                        arrayList.add(new apl(entry.getKey(), matcher.group(1)));
                    }
                }
            }
        }
        return arrayList;
    }

    public List<apl<String, String>> k(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc3e1824", new Object[]{this, str});
        }
        String str4 = this.f24274a + ":parserStrategyBTaoPasswordKey:";
        String str5 = "";
        if (str != null) {
            str2 = str;
        } else {
            str2 = str5;
        }
        fwr.a(str4, str2);
        String str6 = this.f24274a + ":parserStrategyBTaoPasswordKey regxPatternPlanBReplaceMap:";
        Map<String, Pattern> map = this.c;
        if (map != null) {
            str3 = map.toString();
        } else {
            str3 = str5;
        }
        fwr.a(str6, str3);
        String str7 = this.f24274a + ":parserStrategyBTaoPasswordKey regxPatternPlanBFindMap:";
        Map<String, Pattern> map2 = this.d;
        if (map2 != null) {
            str5 = map2.toString();
        }
        fwr.a(str7, str5);
        if (g()) {
            str = str.replaceAll(this.i, " ");
            fwr.a(this.f24274a + ":parserStrategyBTaoPasswordKey phoneRegex replace:", str);
        }
        ArrayList arrayList = new ArrayList();
        if (((ConcurrentHashMap) this.c).size() > 0 && ((ConcurrentHashMap) this.d).size() > 0) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.c).entrySet()) {
                if (entry.getValue() != null) {
                    String replaceAll = ((Pattern) entry.getValue()).matcher(str).replaceAll(" ");
                    fwr.a(this.f24274a + ":parserStrategyBTaoPasswordKey BReplaceRegex replace:", replaceAll);
                    if (((ConcurrentHashMap) this.d).get(entry.getKey()) != null) {
                        Matcher matcher = ((Pattern) ((ConcurrentHashMap) this.d).get(entry.getKey())).matcher(replaceAll);
                        while (matcher.find()) {
                            arrayList.add(new apl(entry.getKey(), matcher.group()));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae64a28", new Object[]{this, str});
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public msl() {
        this.f24274a = "ParserMatchManager";
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = "[🔑🗝😺😸🎁📲💰💲✔🎵🔐/]";
        this.f = "[aZ0bY1cX2dW3eV4fU5gT6hS7iR8jQ9kPlOmNnMoLpKqJrIsHtGuFvEwDxCyBzA]{7,15}|[的一是了我不人在他有这个上们来到时大地为子中你说生国年着就那和要她出也得里后自以会家可下而过天去能对小多然于心学么之都好看起]{7,15}|[㊊㊋㊌㊍㊎㊏㊐㊑㊒㊓㊔㊕㊖㊗㊘㊜㊝㊞㊟㊠㊡㊢㊣㊤㊥㊦㊧㊨㊩㊪㊫㊬㊭㊮㊯㊰]{7,15}";
        this.g = "[()/￥€£₴$₰¢₤¥₳₲₪₵《🔑🗝😺😸🎁📲💰💲✔🎵🔐]([aZ0bY1cX2dW3eV4fU5gT6hS7iR8jQ9kPlOmNnMoLpKqJrIsHtGuFvEwDxCyBzA]{7,15})[()/￥€£₴$₰¢₤¥₳₲₪₵《🔑🗝😺😸🎁📲💰💲✔🎵🔐]";
        this.h = "(1[3-9]\\d{9})|(\\d{3,4}-\\d{7,8})|(\\d{17}[\\dX]|\\d{15})";
        this.i = "(1[3-9]\\d{9})|(\\d{3,4}-\\d{7,8})|(\\d{17}[\\dX]|\\d{15})";
        this.j = "android_share";
        this.k = "replaceRegex";
        this.l = "findARegex";
        this.m = "findRegex";
        this.n = "phoneRegex";
        this.o = "isUseExtractFeature";
        this.p = "isUsePhoneRegex";
        this.q = "isUseExtractHash";
        this.r = "isUseSha256Hash";
        d();
    }
}
