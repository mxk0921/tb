package com.alipay.bifrost;

import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.amnetcore.DftAmnetSwitchManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobile.common.transportext.amnet.Mercury;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.alipay.mobile.common.transportext.amnet.StorageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.c;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.ByteString;
import org.android.agoo.common.AgooConstants;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Target {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Mercury f3811a;
    public Linkage.Touching g;
    public final long h;
    public long i;
    public final StorageManager b = new StorageManager();
    public Linkage c = new DftLinkage();
    public AmnetSwitchManager d = new DftAmnetSwitchManager();
    public final Map<Byte, Channel> e = new TreeMap();
    public final Map<Long, NetTest> f = new TreeMap();
    public int j = 0;
    public String k = "";
    public String l = "";
    public boolean m = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DftLinkage implements Linkage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DftLinkage() {
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public boolean cancelAlarmTimer(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27142692", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return false;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void change(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void collect(Map<Byte, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c002b4", new Object[]{this, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void command(List<Linkage.Cmd> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63e06f43", new Object[]{this, list});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void establish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a79fd140", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void eventTracking(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6b13979", new Object[]{this, str, str2, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void gather(Map<Byte, byte[]> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a52d8a43", new Object[]{this, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void gift(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b062bb4b", new Object[]{this, str, str2});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void initRsp(Initialization.RspInit rspInit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66de5ab3", new Object[]{this, rspInit});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void keep(Linkage.Touching touching, Linkage.Keeping[] keepingArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4cb025c", new Object[]{this, touching, keepingArr, new Integer(i)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public String[] network() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("ce914844", new Object[]{this});
            }
            return null;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void panic(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void reactivate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("672d01ad", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void report(String str, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void reportPerfinfo(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea2bf1d3", new Object[]{this, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void resendSessionid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80e3e1bd", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void restrict(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void retrench(Linkage.Touching touching) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff6296c", new Object[]{this, touching});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void separate(Linkage.Touching touching, Linkage.Separating separating) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83a04db9", new Object[]{this, touching, separating});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void sorry(long j, int i, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ae5cb8", new Object[]{this, new Long(j), new Integer(i), str, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public boolean startAlarmTimer(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eba8e7e2", new Object[]{this, new Integer(i), new Long(j)})).booleanValue();
            }
            return false;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void touch(Linkage.Touching touching) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50713a6c", new Object[]{this, touching});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void command(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6d2ee99", new Object[]{this, bArr});
            }
        }
    }

    public Target(Mercury mercury, long j) {
        this.f3811a = mercury;
        this.h = j;
    }

    public static /* synthetic */ void access$000(Target target, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98807101", new Object[]{target, str, bArr});
        } else {
            target.i(str, bArr);
        }
    }

    public static /* synthetic */ Mercury access$100(Target target) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mercury) ipChange.ipc$dispatch("9936fad4", new Object[]{target});
        }
        return target.f3811a;
    }

    public static String c(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af7cdcc", new Object[]{new Byte(b)});
        }
        return String.valueOf((int) b);
    }

    public static String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        return String.valueOf(i);
    }

    public static String e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        return String.valueOf(j);
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim;
    }

    public static String g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "1";
        }
        return "0";
    }

    public static ByteString p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("c5a709e7", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                StrStrItem strStrItem = new StrStrItem();
                strStrItem.key = key;
                if (!TextUtils.equals(Baggage.Amnet.CFG_CA, key)) {
                    strStrItem.val = f(entry.getValue());
                } else {
                    strStrItem.val = entry.getValue();
                }
                universal.alice.add(strStrItem);
            }
        }
        return ByteString.of(universal.toByteArray());
    }

    public static String[] q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{str});
        }
        String[] strArr = new String[2];
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                strArr[0] = str.trim();
            } else {
                strArr[0] = str.substring(0, indexOf).trim();
                strArr[1] = str.substring(indexOf + 1).trim();
            }
            if (strArr[0].length() == 0) {
                strArr[0] = null;
            }
            String str2 = strArr[1];
            if (str2 != null && str2.length() == 0) {
                strArr[1] = null;
            }
        }
        return strArr;
    }

    public final long a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d70", new Object[]{this, str, str2})).longValue();
        }
        try {
            return Long.parseLong(str2);
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to parse a integer. (key=\"" + str + "\", value=\"" + str2 + "\")");
            return -1L;
        }
    }

    public boolean activate(Storage storage, Linkage linkage, AmnetSwitchManager amnetSwitchManager, Map<Byte, Channel> map, String str, String str2, String str3, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str4, String str5, boolean z, boolean z2, boolean z3, int i, Map<String, Object> map5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fffe868", new Object[]{this, storage, linkage, amnetSwitchManager, map, str, str2, str3, map2, map3, map4, str4, str5, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), map5})).booleanValue();
        }
        if (storage != null) {
            this.b.register(storage);
        }
        if (linkage != null) {
            this.c = linkage;
        }
        if (amnetSwitchManager != null) {
            this.d = amnetSwitchManager;
        }
        if (map != null) {
            for (Map.Entry<Byte, Channel> entry : map.entrySet()) {
                Byte key = entry.getKey();
                if (key != null) {
                    Channel value = entry.getValue();
                    if (value == null) {
                        ((TreeMap) this.e).remove(key);
                    } else {
                        ((TreeMap) this.e).put(key, value);
                    }
                }
            }
        }
        setSwitch();
        h();
        t(map5);
        return l(str, str2, str3, map2, map3, map4, str4, str5, z, z2, z3, i, map5);
    }

    public void alert(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84116ba3", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "receipt";
        strStrItem.val = e(j);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "duration";
        strStrItem2.val = e(j2);
        universal.alice.add(strStrItem2);
        Bifrost.alert(universal.toByteArray());
    }

    public void collectInitInf() {
        ByteString byteString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc56d2e", new Object[]{this});
            return;
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        this.c.collect(treeMap);
        this.c.gather(treeMap2);
        j(treeMap);
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        for (Map.Entry entry : treeMap.entrySet()) {
            Byte b = (Byte) entry.getKey();
            if (b != null) {
                StrBinItem strBinItem = new StrBinItem();
                strBinItem.key = ":" + String.valueOf((int) b.byteValue());
                strBinItem.val = p((Map) entry.getValue());
                universal.bob.add(strBinItem);
            }
        }
        for (Map.Entry entry2 : treeMap2.entrySet()) {
            Byte b2 = (Byte) entry2.getKey();
            if (b2 != null) {
                StrBinItem strBinItem2 = new StrBinItem();
                strBinItem2.key = "." + String.valueOf((int) b2.byteValue());
                byte[] bArr = (byte[]) entry2.getValue();
                if (bArr == null) {
                    byteString = null;
                } else {
                    byteString = ByteString.of(bArr);
                }
                strBinItem2.val = byteString;
                universal.bob.add(strBinItem2);
            }
        }
        Bifrost.initialize(universal.toByteArray());
    }

    public byte[] getCfg(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("160744be", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        if (z2) {
            byte[] bigData = this.b.getBigData(str, z);
            if (bigData == null) {
                return new byte[0];
            }
            return bigData;
        } else if (!z) {
            byte[] secure = this.b.getSecure(str);
            if (secure == null) {
                return new byte[0];
            }
            return secure;
        } else {
            byte[] common = this.b.getCommon(str);
            if (common == null) {
                return new byte[0];
            }
            return common;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        byte[] common = this.b.getCommon("/setting-cfg");
        Universal universal = new Universal();
        universal.bob = new LinkedList();
        StrBinItem strBinItem = new StrBinItem();
        if (common != null && common.length > 0) {
            strBinItem.key = "/setting-cfg";
            strBinItem.val = ByteString.of(common);
            universal.bob.add(strBinItem);
        }
        byte[] secure = this.b.getSecure("/mmtp-did");
        if (secure != null && secure.length > 0) {
            StrBinItem strBinItem2 = new StrBinItem();
            strBinItem2.key = "/mmtp-did";
            strBinItem2.val = ByteString.of(secure);
            universal.bob.add(strBinItem2);
        }
        byte[] byteArray = universal.toByteArray();
        if (byteArray != null && byteArray.length > 0) {
            Bifrost.setCfg(byteArray);
        }
    }

    public boolean hit(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae76336e", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j == this.h) {
            return true;
        }
        return false;
    }

    public final void i(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
            return;
        }
        Universal universal = new Universal();
        universal.bob = new LinkedList();
        StrBinItem strBinItem = new StrBinItem();
        if (bArr == null || bArr.length <= 0) {
            Bifrost.track("WARN", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "no dict data, remove the dict id in file");
            this.b.removeCommon("zstd_config_storage_key");
            strBinItem.key = "zstd.data";
            strBinItem.val = StrBinItem.DEFAULT_VAL;
            universal.bob.add(strBinItem);
        } else {
            strBinItem.key = str;
            strBinItem.val = ByteString.of(bArr);
            universal.bob.add(strBinItem);
        }
        byte[] byteArray = universal.toByteArray();
        if (byteArray != null && byteArray.length > 0) {
            Bifrost.setCfg(byteArray);
        }
    }

    public void inactivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fc259f", new Object[]{this});
        } else {
            Bifrost.stop();
        }
    }

    public final void k(Map<String, Object> map, Universal universal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e43cca", new Object[]{this, map, universal});
        } else if (map != null) {
            Object obj = map.get(Baggage.Amnet.KEY_SUB_TARGET_TYPE);
            if (obj != null && (obj instanceof String)) {
                universal.alice.add(PbHelper.newStrStrItem("subTargetType", (String) obj));
            }
            Object obj2 = map.get(Baggage.Amnet.KEY_CHECK_CERT);
            if (obj2 != null && (obj2 instanceof String)) {
                StrBinItem strBinItem = new StrBinItem();
                strBinItem.key = "cfg-params";
                HashMap hashMap = new HashMap();
                hashMap.put(Baggage.Amnet.KEY_CHECK_CERT, (String) obj2);
                strBinItem.val = p(hashMap);
                universal.bob.add(strBinItem);
            }
        }
    }

    public final boolean l(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str4, String str5, boolean z, boolean z2, boolean z3, int i, Map<String, Object> map4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72013267", new Object[]{this, str, str2, str3, map, map2, map3, str4, str5, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), map4})).booleanValue();
        }
        this.k = str4;
        this.l = str5;
        byte[] secure = this.b.getSecure("/std-ticket");
        byte[] secure2 = this.b.getSecure("/std-session");
        byte[] secure3 = this.b.getSecure("/mtls-session");
        byte[] common = this.b.getCommon("/mtls-cache");
        byte[] secure4 = this.b.getSecure("/environment");
        byte[] secure5 = this.b.getSecure("/cfg-sequence");
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "target";
        strStrItem.val = e(this.h);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "host-LL";
        strStrItem2.val = f(str);
        universal.alice.add(strStrItem2);
        StrStrItem strStrItem3 = new StrStrItem();
        strStrItem3.key = "host-SL";
        strStrItem3.val = f(str2);
        universal.alice.add(strStrItem3);
        StrStrItem strStrItem4 = new StrStrItem();
        strStrItem4.key = "host-ML";
        strStrItem4.val = f(str3);
        universal.alice.add(strStrItem4);
        StrStrItem strStrItem5 = new StrStrItem();
        strStrItem5.key = "inf-major";
        strStrItem5.val = f(str4);
        universal.alice.add(strStrItem5);
        StrStrItem strStrItem6 = new StrStrItem();
        strStrItem6.key = "inf-minor";
        strStrItem6.val = f(str5);
        universal.alice.add(strStrItem6);
        StrStrItem strStrItem7 = new StrStrItem();
        strStrItem7.key = "ground";
        strStrItem7.val = g(z);
        universal.alice.add(strStrItem7);
        StrStrItem strStrItem8 = new StrStrItem();
        strStrItem8.key = "screen";
        strStrItem8.val = g(z2);
        universal.alice.add(strStrItem8);
        StrStrItem strStrItem9 = new StrStrItem();
        strStrItem9.key = "master";
        strStrItem9.val = g(z3);
        universal.alice.add(strStrItem9);
        StrStrItem strStrItem10 = new StrStrItem();
        strStrItem10.key = "targetType";
        strStrItem10.val = d(i);
        universal.alice.add(strStrItem10);
        StrBinItem strBinItem = new StrBinItem();
        strBinItem.key = "cfg-LL";
        strBinItem.val = p(map);
        universal.bob.add(strBinItem);
        StrBinItem strBinItem2 = new StrBinItem();
        strBinItem2.key = "cfg-SL";
        strBinItem2.val = p(map2);
        universal.bob.add(strBinItem2);
        StrBinItem strBinItem3 = new StrBinItem();
        strBinItem3.key = "cfg-ML";
        strBinItem3.val = p(map3);
        universal.bob.add(strBinItem3);
        if (secure != null) {
            StrBinItem strBinItem4 = new StrBinItem();
            strBinItem4.key = "/std-ticket";
            strBinItem4.val = ByteString.of(secure);
            universal.bob.add(strBinItem4);
        }
        if (secure2 != null) {
            StrBinItem strBinItem5 = new StrBinItem();
            strBinItem5.key = "/std-session";
            strBinItem5.val = ByteString.of(secure2);
            universal.bob.add(strBinItem5);
        }
        if (secure3 != null) {
            StrBinItem strBinItem6 = new StrBinItem();
            strBinItem6.key = "/mtls-session";
            strBinItem6.val = ByteString.of(secure3);
            universal.bob.add(strBinItem6);
        }
        if (common != null) {
            StrBinItem strBinItem7 = new StrBinItem();
            strBinItem7.key = "/mtls-cache";
            strBinItem7.val = ByteString.of(common);
            universal.bob.add(strBinItem7);
        }
        if (secure4 != null) {
            StrBinItem strBinItem8 = new StrBinItem();
            strBinItem8.key = "/environment";
            strBinItem8.val = ByteString.of(secure4);
            universal.bob.add(strBinItem8);
        }
        if (secure5 != null) {
            StrBinItem strBinItem9 = new StrBinItem();
            strBinItem9.key = "/cfg-sequence";
            strBinItem9.val = ByteString.of(secure5);
            universal.bob.add(strBinItem9);
        }
        k(map4, universal);
        return Bifrost.start(universal.toByteArray());
    }

    public void launch(NetTest netTest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5782d99f", new Object[]{this, netTest});
            return;
        }
        long j = this.i + 1;
        this.i = j;
        ((TreeMap) this.f).put(Long.valueOf(j), netTest);
        Bifrost.launch(j);
    }

    public final int m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{this, str, str2})).intValue();
        }
        return (int) a(str, str2);
    }

    public final Map<String, String> o(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcb9be2f", new Object[]{this, str, bArr});
        }
        TreeMap treeMap = new TreeMap();
        try {
            for (StrStrItem strStrItem : ((Universal) new c(new Class[0]).e(bArr, Universal.class)).alice) {
                String str2 = strStrItem.key;
                if (str2 != null) {
                    treeMap.put(str2, strStrItem.val);
                }
            }
            return treeMap;
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a KV. (key=\"" + str + "\")");
            return treeMap;
        }
    }

    public void packageData(byte[] bArr) {
        Channel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00eec9e", new Object[]{this, bArr});
            return;
        }
        Channel.Obtaining w = w(bArr);
        if (w != null && (channel = (Channel) ((TreeMap) this.e).get(Byte.valueOf(w.channel))) != null) {
            w.isUseBifrost = true;
            channel.obtain(w);
        }
    }

    public void post(long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, byte b, String str2, String str3, Map<String, String> map, byte[] bArr, Map<String, String> map2, long j3, long j4, boolean z6, boolean z7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c5052", new Object[]{this, new Long(j), new Long(j2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), str, new Byte(b), str2, str3, map, bArr, map2, new Long(j3), new Long(j4), new Boolean(z6), new Boolean(z7)});
            return;
        }
        long nanoTime = System.nanoTime();
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "moment";
        strStrItem.val = e(j);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "arrive";
        strStrItem2.val = e(nanoTime);
        universal.alice.add(strStrItem2);
        StrStrItem strStrItem3 = new StrStrItem();
        strStrItem3.key = "receipt";
        strStrItem3.val = e(j2);
        universal.alice.add(strStrItem3);
        StrStrItem strStrItem4 = new StrStrItem();
        strStrItem4.key = "time-queue";
        strStrItem4.val = e(j3);
        universal.alice.add(strStrItem4);
        StrStrItem strStrItem5 = new StrStrItem();
        strStrItem5.key = "time-amnet";
        strStrItem5.val = e(j4);
        universal.alice.add(strStrItem5);
        StrStrItem strStrItem6 = new StrStrItem();
        strStrItem6.key = "IP-fwd";
        strStrItem6.val = f(str2);
        universal.alice.add(strStrItem6);
        StrStrItem strStrItem7 = new StrStrItem();
        strStrItem7.key = "ID-trace";
        strStrItem7.val = f(str3);
        universal.alice.add(strStrItem7);
        StrStrItem strStrItem8 = new StrStrItem();
        strStrItem8.key = "important";
        strStrItem8.val = g(z);
        universal.alice.add(strStrItem8);
        StrStrItem strStrItem9 = new StrStrItem();
        strStrItem9.key = "secret";
        strStrItem9.val = g(z2);
        universal.alice.add(strStrItem9);
        StrStrItem strStrItem10 = new StrStrItem();
        strStrItem10.key = "nearing";
        strStrItem10.val = g(z3);
        universal.alice.add(strStrItem10);
        StrStrItem strStrItem11 = new StrStrItem();
        strStrItem11.key = ShopConstants.PARAM_SHORTCUT;
        strStrItem11.val = g(z4);
        universal.alice.add(strStrItem11);
        StrStrItem strStrItem12 = new StrStrItem();
        strStrItem12.key = "no-long";
        strStrItem12.val = g(z5);
        universal.alice.add(strStrItem12);
        StrStrItem strStrItem13 = new StrStrItem();
        strStrItem13.key = "short-IPList";
        strStrItem13.val = f(str);
        universal.alice.add(strStrItem13);
        StrStrItem strStrItem14 = new StrStrItem();
        strStrItem14.key = "channel";
        strStrItem14.val = c(b);
        universal.alice.add(strStrItem14);
        StrStrItem strStrItem15 = new StrStrItem();
        strStrItem15.key = "multiplex";
        strStrItem15.val = g(z6);
        universal.alice.add(strStrItem15);
        StrStrItem strStrItem16 = new StrStrItem();
        strStrItem16.key = "isUrgent";
        strStrItem16.val = g(z7);
        universal.alice.add(strStrItem16);
        StrBinItem strBinItem = new StrBinItem();
        strBinItem.key = "header";
        strBinItem.val = p(map);
        universal.bob.add(strBinItem);
        StrBinItem strBinItem2 = new StrBinItem();
        strBinItem2.key = AgooConstants.MESSAGE_BODY;
        strBinItem2.val = bArr == null ? null : ByteString.of(bArr);
        universal.bob.add(strBinItem2);
        StrBinItem strBinItem3 = new StrBinItem();
        strBinItem3.key = "params";
        strBinItem3.val = p(map2);
        universal.bob.add(strBinItem3);
        Bifrost.post(universal.toByteArray());
    }

    public void preConnect(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42135da", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            Bifrost.preConnect(str, i, z, i2);
        }
    }

    public int query() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("943af942", new Object[]{this})).intValue();
        }
        return Bifrost.ask();
    }

    public final byte r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f277e36a", new Object[]{this, str, str2})).byteValue();
        }
        return (byte) a(str, str2);
    }

    public void reLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb6f27d", new Object[]{this});
        } else {
            this.c.reactivate();
        }
    }

    public void recycleData(byte[] bArr) {
        Channel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25496eab", new Object[]{this, bArr});
            return;
        }
        Channel.Obtaining w = w(bArr);
        if (w != null && (channel = (Channel) ((TreeMap) this.e).get(Byte.valueOf(w.channel))) != null) {
            channel.recycle(w.header, w.body);
        }
    }

    public void reportPerfinfo(byte[] bArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695037b9", new Object[]{this, bArr});
            return;
        }
        try {
            Universal universal = (Universal) new c(new Class[0]).e(bArr, Universal.class);
            HashMap hashMap = new HashMap(8);
            for (StrStrItem strStrItem : universal.alice) {
                String str2 = strStrItem.key;
                if (!(str2 == null || (str = strStrItem.val) == null)) {
                    hashMap.put(str2, str);
                }
            }
            this.c.reportPerfinfo(hashMap);
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a configuration.");
        }
    }

    public void resendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3e1bd", new Object[]{this});
        } else {
            this.c.resendSessionid();
        }
    }

    public void resultCmd(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9a49ab", new Object[]{this, bArr});
        } else {
            this.c.command(bArr);
        }
    }

    public void resultConn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0c75b7", new Object[]{this, bArr});
            return;
        }
        Linkage.Touching b = b(bArr);
        this.g = b;
        if (b != null) {
            b.isUseBifrost = true;
            this.c.touch(b);
        }
    }

    public void resultDisconn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7c7bab", new Object[]{this, bArr});
            return;
        }
        Linkage.Touching touching = this.g;
        if (touching == null) {
            touching = new Linkage.Touching();
            touching.msDns = Double.NaN;
            touching.msTcp = Double.NaN;
            touching.msAttempt = Double.NaN;
        } else {
            this.g = null;
        }
        Linkage.Separating n = n(bArr);
        if (n != null) {
            n.isUseBifrost = true;
            this.c.separate(touching, n);
        }
    }

    public void resultHb(byte[] bArr) {
        Linkage.Keeping[] v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361a9c45", new Object[]{this, bArr});
        } else if (this.g != null && (v = v(bArr)) != null) {
            Linkage.Touching touching = this.g;
            touching.isUseBifrost = true;
            this.c.keep(touching, v, v.length);
        }
    }

    public final Linkage.Keeping s(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Keeping) ipChange.ipc$dispatch("614b5ab", new Object[]{this, bArr});
        }
        Linkage.Keeping keeping = new Linkage.Keeping();
        c cVar = new c(new Class[0]);
        keeping.stamp = -1L;
        keeping.interval = -1;
        keeping.rtt = Double.NaN;
        keeping.sReal = -1;
        try {
            for (StrStrItem strStrItem : ((Universal) cVar.e(bArr, Universal.class)).alice) {
                String str = strStrItem.key;
                if (str != null) {
                    if (str.equalsIgnoreCase("/stamp")) {
                        keeping.stamp = a(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/RTT")) {
                        long a2 = a(strStrItem.key, strStrItem.val);
                        if (a2 >= 0) {
                            keeping.rtt = a2;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/interval")) {
                        keeping.interval = m(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/actual")) {
                        keeping.sReal = m(strStrItem.key, strStrItem.val);
                    }
                }
            }
            return keeping;
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a heartbeat-information.");
            return keeping;
        }
    }

    public void saveCfg(byte[] bArr, boolean z, boolean z2, boolean z3) {
        ByteString byteString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d0d43f", new Object[]{this, bArr, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        try {
            Iterator<StrBinItem> it = ((Universal) new c(new Class[0]).e(bArr, Universal.class)).bob.iterator();
            if (z3) {
                while (it.hasNext()) {
                    String str = it.next().key;
                    if (str != null) {
                        if (!z2) {
                            this.b.removeCommon(str);
                        } else {
                            this.b.removeBigData(str);
                        }
                    }
                }
                return;
            }
            while (it.hasNext()) {
                StrBinItem next = it.next();
                String str2 = next.key;
                if (!(str2 == null || (byteString = next.val) == null)) {
                    if (z2) {
                        this.b.putBigDataAsync(str2, byteString.toByteArray(), z);
                    } else if (z) {
                        this.b.putCommonTransmit(str2, byteString.toByteArray());
                    } else {
                        this.b.putSecureTransmit(str2, byteString.toByteArray());
                    }
                }
            }
            if (!z2) {
                this.b.putCommit();
            }
        } catch (Throwable th) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a configuration." + th.toString());
        }
    }

    public void serverRestrict(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65c9c27", new Object[]{this, new Integer(i), str});
        } else {
            this.c.restrict(i, str);
        }
    }

    public void statusConnection(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea122f97", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.j = i2;
        Bifrost.track("INFO", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "state change to " + this.j);
        this.c.change(i2);
    }

    public final void t(Map<String, Object> map) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (map != null) {
            try {
                Object remove = map.remove(Baggage.Amnet.KEY_BIND_HOSTS);
                if (remove != null) {
                    if (!(remove instanceof Map)) {
                        LogCatUtil.info(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "[setBindedHostsInfo] Illage object type is : ".concat(remove.getClass().getName()));
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : ((Map) remove).entrySet()) {
                        if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && (pair = (Pair) entry.getValue()) != null && !TextUtils.isEmpty((CharSequence) pair.first)) {
                            String str = ((String) pair.first) + ":" + pair.second;
                            StnLogic.setDebugIP((String) entry.getKey(), str);
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append(str);
                            sb.append(",");
                        }
                    }
                    if (sb.length() > 0) {
                        LogCatUtil.info(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "[setBindedHostsInfo] Finished. hosts info = [" + sb.toString() + "]");
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "[setBindedHostsInfo] Exception: " + th.toString(), th);
            }
        }
    }

    public void tellSendTraffic(int i, long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e9c22c", new Object[]{this, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
        } else if (i <= 256 && i >= 0 && i2 >= 0 && i3 >= 0) {
            try {
                Channel channel = (Channel) ((TreeMap) this.e).get(Byte.valueOf(Integer.valueOf(i).byteValue()));
                if (channel != null) {
                    channel.tell(j, i2, i3);
                }
            } catch (Throwable th) {
                Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "tellSendTraffic error: " + th.toString());
            }
        }
    }

    public final boolean u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{this, str, str2})).booleanValue();
        }
        if (a(str, str2) > 0) {
            return true;
        }
        return false;
    }

    public final Linkage.Keeping[] v(byte[] bArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Keeping[]) ipChange.ipc$dispatch("75b8e539", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new c(new Class[0]).e(bArr, Universal.class);
            Linkage.Keeping[] keepingArr = new Linkage.Keeping[universal.bob.size()];
            for (StrBinItem strBinItem : universal.bob) {
                ByteString byteString = strBinItem.val;
                if (byteString != null) {
                    keepingArr[i] = s(byteString.toByteArray());
                    i++;
                }
            }
            return keepingArr;
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of heartbeat-information.");
            return null;
        }
    }

    public final void j(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null || map2.isEmpty()) {
            AppLogicICallBackImpl.getInstance().setUserId("");
            return;
        }
        String str = map2.get("userId");
        if (TextUtils.isEmpty(str)) {
            AppLogicICallBackImpl.getInstance().setUserId("");
        } else {
            AppLogicICallBackImpl.getInstance().setUserId(str);
        }
    }

    public void resultInit(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5880309b", new Object[]{this, bArr});
            return;
        }
        try {
            Universal universal = (Universal) new c(new Class[0]).e(bArr, Universal.class);
            Initialization.RspInit rspInit = new Initialization.RspInit();
            for (StrStrItem strStrItem : universal.alice) {
                String str = strStrItem.key;
                if (str != null) {
                    if (str.equalsIgnoreCase("status")) {
                        rspInit.status = m(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("reconn")) {
                        rspInit.reconn = m(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase(TriggerChannelService.EXTRA_ORIGIN)) {
                        rspInit.origin = a(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("ncrmnt")) {
                        rspInit.ncrmnt = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("makeup")) {
                        rspInit.makeup = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("notify")) {
                        rspInit.notifyLoginOut = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("expand")) {
                        rspInit.expand = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE)) {
                        rspInit.device = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("client")) {
                        rspInit.clientIp = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("dictid")) {
                        rspInit.dictId = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("mtag")) {
                        rspInit.mtag = strStrItem.val;
                    }
                }
            }
            this.c.establish();
            this.c.initRsp(rspInit);
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of an init-response.");
        }
    }

    public void resultLaunch(long j, byte[] bArr) {
        Object obj;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98fc074", new Object[]{this, new Long(j), bArr});
            return;
        }
        try {
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            for (StrStrItem strStrItem : ((Universal) new c(new Class[0]).e(bArr, Universal.class)).alice) {
                String str2 = strStrItem.key;
                if (str2 != null) {
                    if (str2.equalsIgnoreCase("fin")) {
                        z = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("ok")) {
                        z3 = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase(pg1.ATOM_done)) {
                        z2 = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("summary")) {
                        str = strStrItem.val;
                    }
                }
            }
            if (!z || !z2) {
                obj = ((TreeMap) this.f).get(Long.valueOf(j));
            } else {
                obj = ((TreeMap) this.f).remove(Long.valueOf(j));
            }
            NetTest netTest = (NetTest) obj;
            if (netTest != null) {
                netTest.report(z, z3, z2, str);
            }
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a net-test.");
        }
    }

    public void setSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f87bd", new Object[]{this});
            return;
        }
        try {
            Universal universal = new Universal();
            universal.alice = new LinkedList();
            StrStrItem strStrItem = new StrStrItem();
            strStrItem.key = "imc";
            strStrItem.val = g(this.d.isEnableInitMergeSync());
            universal.alice.add(strStrItem);
            StrStrItem strStrItem2 = new StrStrItem();
            strStrItem2.key = "b_sl";
            strStrItem2.val = g(this.d.isEnableShortLink(true));
            universal.alice.add(strStrItem2);
            StrStrItem strStrItem3 = new StrStrItem();
            strStrItem3.key = "mars.stn.longlink.connmax";
            strStrItem3.val = d(this.d.getLonglinkConnMax());
            universal.alice.add(strStrItem3);
            byte[] byteArray = universal.toByteArray();
            if (byteArray != null && byteArray.length > 0) {
                Bifrost.setSwitch(byteArray);
            }
            LogCatUtil.debug(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "setSwitch, KEY_SW_IMC:" + this.d.isEnableInitMergeSync() + ",KEY_SW_SHORTCUT:" + this.d.isEnableShortLink(true) + ",KEY_SW_LONGLINK_CONNMAX:" + this.d.getLonglinkConnMax());
        } catch (Throwable th) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "setSwitch error" + th.toString());
        }
    }

    public void sorry(long j, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743eb976", new Object[]{this, new Long(j), new Integer(i), str, new Integer(i2)});
        } else if (j >= 0 && i != 0) {
            Bifrost.track("WARN", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "sorry rpcid:" + j + ", errCode:" + i + ", errInf:" + str);
            HashMap hashMap = new HashMap();
            if (1 == i2) {
                hashMap.put(AmnetConstant.KEY_AMNET_LIB_VERSION, AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST_HTTP2);
            } else {
                hashMap.put(AmnetConstant.KEY_AMNET_LIB_VERSION, AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST);
            }
            this.c.sorry(j, i, str, hashMap);
        }
    }

    public void tellReadZstdFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e687d13", new Object[]{this});
        } else {
            this.b.getBigDataAsync("zstd.data", false, 5, new Storage.Result() { // from class: com.alipay.bifrost.Target.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.amnet.Storage.Result
                public void callbackData(final String str, final byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8be62ba7", new Object[]{this, str, bArr});
                    } else {
                        Target.access$100(Target.this).post(new Runnable() { // from class: com.alipay.bifrost.Target.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    Target.access$000(Target.this, str, bArr);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final Linkage.Touching b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Touching) ipChange.ipc$dispatch("fe252d", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new c(new Class[0]).e(bArr, Universal.class);
            Linkage.Touching touching = new Linkage.Touching();
            touching.yesLnk = true;
            touching.msDns = Double.NaN;
            touching.msTcp = Double.NaN;
            touching.msAttempt = Double.NaN;
            for (StrStrItem strStrItem : universal.alice) {
                String str = strStrItem.key;
                if (str != null) {
                    if (str.equalsIgnoreCase("/proxy")) {
                        touching.proxy = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/network")) {
                        touching.network = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/netname")) {
                        touching.netname = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ip-local")) {
                        touching.ipLocal = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ip-remote")) {
                        touching.ipRemote = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ip-server")) {
                        touching.ipServer = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/port-local")) {
                        touching.portLocal = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/port-remote")) {
                        touching.portRemote = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/port-server")) {
                        touching.portServer = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-dns")) {
                        long a2 = a(strStrItem.key, strStrItem.val);
                        if (a2 >= 0) {
                            touching.msDns = a2;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-tcp")) {
                        long a3 = a(strStrItem.key, strStrItem.val);
                        if (a3 >= 0) {
                            touching.msTcp = a3;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-attempt")) {
                        long a4 = a(strStrItem.key, strStrItem.val);
                        if (a4 >= 0) {
                            touching.msAttempt = a4;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/conn-reason")) {
                        touching.reason = m(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/count-attempt")) {
                        touching.cntAttempt = m(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/cid")) {
                        touching.cid = a(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("targetType")) {
                        if (1 == m(strStrItem.key, strStrItem.val)) {
                            touching.isUseHttp2 = true;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("channelSelect")) {
                        touching.channelSelect = m(strStrItem.key, strStrItem.val);
                    }
                }
            }
            return touching;
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a connect-information.");
            return null;
        }
    }

    public final Linkage.Separating n(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Separating) ipChange.ipc$dispatch("21bc194f", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new c(new Class[0]).e(bArr, Universal.class);
            Linkage.Separating separating = new Linkage.Separating();
            separating.yesSsl = true;
            separating.msSsl = Double.NaN;
            separating.msLife = Double.NaN;
            separating.msFirst = Double.NaN;
            for (StrStrItem strStrItem : universal.alice) {
                String str = strStrItem.key;
                if (str != null) {
                    if (str.equalsIgnoreCase("/ssl-fast")) {
                        separating.fast = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/ssl-ticket")) {
                        separating.ticket = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/ssl-standard")) {
                        separating.standard = u(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-ssl")) {
                        long a2 = a(strStrItem.key, strStrItem.val);
                        if (a2 >= 0) {
                            separating.msSsl = a2;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-life")) {
                        long a3 = a(strStrItem.key, strStrItem.val);
                        if (a3 >= 0) {
                            separating.msLife = a3;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-first")) {
                        long a4 = a(strStrItem.key, strStrItem.val);
                        if (a4 >= 0) {
                            separating.msFirst = a4;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/errCode")) {
                        separating.codeErr = m(strStrItem.key, strStrItem.val);
                        separating.yesErr = true;
                    } else if (strStrItem.key.equalsIgnoreCase("/errInf")) {
                        separating.infErr = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/certificate")) {
                        separating.extMsg = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("mtag")) {
                        separating.mtag = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("targetType")) {
                        if (1 == m(strStrItem.key, strStrItem.val)) {
                            separating.isUseHttp2 = true;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("channelSelect")) {
                        separating.channelSelect = m(strStrItem.key, strStrItem.val);
                    }
                }
            }
            for (StrBinItem strBinItem : universal.bob) {
                String str2 = strBinItem.key;
                if (!(str2 == null || strBinItem.val == null || !str2.equalsIgnoreCase("/heartbeat"))) {
                    Linkage.Keeping[] v = v(strBinItem.val.toByteArray());
                    separating.infHb = v;
                    separating.cntHb = v.length;
                }
            }
            return separating;
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a disconnect-information.");
            return null;
        }
    }

    public void alter(int i, String str, String str2, Map<Byte, byte[]> map) {
        String str3;
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d77d2b", new Object[]{this, new Integer(i), str, str2, map});
            return;
        }
        if (i == 0 && this.m) {
            this.m = false;
            if (this.k == null) {
                this.k = "";
            }
            if (this.l == null) {
                this.l = "";
            }
            if (this.k.equalsIgnoreCase(str) && this.l.equalsIgnoreCase(str2)) {
                Bifrost.track("INFO", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Ignore the first alter net.");
                return;
            }
        }
        if (12 == i) {
            setSwitch();
            return;
        }
        if (4 == i) {
            if (str.compareToIgnoreCase("login") == 0) {
                z = true;
            } else if (str.compareToIgnoreCase("logout") != 0) {
                z = false;
                z2 = false;
            } else {
                z = false;
            }
            if (z2) {
                String[] q = q(str2);
                if (TextUtils.isEmpty(q[0]) || !z) {
                    q[0] = "";
                }
                AppLogicICallBackImpl.getInstance().setUserId(q[0]);
            }
        }
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "status";
        strStrItem.val = d(i);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "inf-major";
        strStrItem2.val = f(str);
        universal.alice.add(strStrItem2);
        StrStrItem strStrItem3 = new StrStrItem();
        strStrItem3.key = "inf-minor";
        strStrItem3.val = f(str2);
        universal.alice.add(strStrItem3);
        if (map == null) {
            str3 = "is null";
        } else {
            str3 = "not null";
        }
        LogCatUtil.printInfo(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "target.java alter,extMap: ".concat(str3));
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Byte, byte[]> entry : map.entrySet()) {
                Byte key = entry.getKey();
                if (key != null) {
                    StrBinItem strBinItem = new StrBinItem();
                    strBinItem.key = String.valueOf((int) key.byteValue());
                    byte[] value = entry.getValue();
                    strBinItem.val = value == null ? null : ByteString.of(value);
                    universal.bob.add(strBinItem);
                }
            }
        }
        Bifrost.alter(universal.toByteArray());
    }

    public final Channel.Obtaining w(byte[] bArr) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Channel.Obtaining) ipChange.ipc$dispatch("f7e7498f", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new c(new Class[0]).e(bArr, Universal.class);
            Channel.Obtaining obtaining = new Channel.Obtaining();
            obtaining.msCall = Double.NaN;
            obtaining.msPassToNative = Double.NaN;
            obtaining.msSend = Double.NaN;
            obtaining.msRead = Double.NaN;
            obtaining.msPassFromNative = Double.NaN;
            obtaining.msCaller = Double.NaN;
            obtaining.msCalling = Double.NaN;
            obtaining.msConfirm = Double.NaN;
            obtaining.msAir = Double.NaN;
            obtaining.msAmnetAllTime = Double.NaN;
            obtaining.msNtIO = Double.NaN;
            obtaining.msQueueOut = Double.NaN;
            obtaining.msHung = Double.NaN;
            obtaining.msEncode = Double.NaN;
            long nanoTime = System.nanoTime();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = -1;
            long j3 = -1;
            long j4 = -1;
            long j5 = -1;
            long j6 = -1;
            long j7 = -1;
            long j8 = -1;
            long j9 = -1;
            for (Iterator<StrStrItem> it = universal.alice.iterator(); it.hasNext(); it = it) {
                StrStrItem next = it.next();
                String str = next.key;
                if (str != null) {
                    if (str.equalsIgnoreCase("receipt")) {
                        obtaining.receipt = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("channel")) {
                        obtaining.channel = r(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("moment")) {
                        j2 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("arrive")) {
                        j3 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("time-queue")) {
                        j8 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("time-amnet")) {
                        j4 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-hang")) {
                        j5 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-ack")) {
                        j6 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-send")) {
                        j9 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-air")) {
                        j7 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("retried")) {
                        obtaining.retried = u(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("oneshot")) {
                        obtaining.oneshot = u(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("useShort")) {
                        obtaining.useshort = u(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("rcvRaw")) {
                        obtaining.lenRaw = m(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("rcvPkg")) {
                        obtaining.lenPkg = m(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("rcvZip")) {
                        obtaining.rspZipType = m(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("sendZip")) {
                        obtaining.reqZipType = m(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("mtag")) {
                        obtaining.mtag = next.val;
                    } else if (next.key.equalsIgnoreCase("/cid")) {
                        obtaining.cid = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("targetHost")) {
                        obtaining.targetHost = next.val;
                    } else if (next.key.equalsIgnoreCase("targetHostShort")) {
                        obtaining.targetHostShort = next.val;
                    } else if (next.key.equalsIgnoreCase("targetType")) {
                        if (1 == m(next.key, next.val)) {
                            obtaining.isUseHttp2 = true;
                        }
                    } else if (next.key.equalsIgnoreCase("ip_stack")) {
                        obtaining.ipStack = m(next.key, next.val);
                    }
                }
            }
            for (StrBinItem strBinItem : universal.bob) {
                String str2 = strBinItem.key;
                if (!(str2 == null || strBinItem.val == null)) {
                    if (str2.equalsIgnoreCase("header")) {
                        obtaining.header = o(strBinItem.key, strBinItem.val.toByteArray());
                    } else if (strBinItem.key.equalsIgnoreCase(AgooConstants.MESSAGE_BODY)) {
                        obtaining.body = strBinItem.val.toByteArray();
                    }
                }
            }
            if (obtaining.body == null) {
                obtaining.body = new byte[0];
            }
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i < 0 || j3 < 0 || j3 < j2) {
                j = currentTimeMillis;
            } else {
                j = currentTimeMillis;
                obtaining.msCall = (j3 - j2) / 1000000.0d;
            }
            if (i >= 0 && nanoTime >= 0 && nanoTime >= j2) {
                obtaining.msCaller = (nanoTime - j2) / 1000000.0d;
            }
            if (j3 >= 0 && nanoTime >= 0 && nanoTime >= j3) {
                obtaining.msCalling = (nanoTime - j3) / 1000000.0d;
            }
            if (j4 >= 0 && j >= 0 && j >= j4) {
                obtaining.msAmnetAllTime = j - j4;
            }
            if (j8 >= 0 && j5 >= 0) {
                obtaining.msQueueOut = j5;
                obtaining.msQueneStorage = j8 + "-0";
            }
            if (j7 >= 0) {
                obtaining.msAir = j7;
            }
            if (j6 >= 0) {
                obtaining.msConfirm = j6;
            } else {
                obtaining.msConfirm = obtaining.msAir;
            }
            if (j9 >= 0) {
                obtaining.msHung = j9;
            }
            return obtaining;
        } catch (Throwable unused) {
            Bifrost.track("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a data-package.");
            return null;
        }
    }
}
