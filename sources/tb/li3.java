package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.tao.channel.mtop.GetPanelInfoResponseData;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.ShareAppRegister;
import com.ut.share.SharePlatform;
import com.ut.share.business.ShareTargetType;
import com.ut.share.utils.InstalledPackages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class li3 implements smb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOMO_PKG = "com.immomo.momo";
    public static final String QQ_LITE_PKG = "com.tencent.qqlite";
    public static final String QQ_PKG = "com.tencent.mobileqq";
    public static final String WEIXIN_PKG = "com.tencent.mm";
    public static HashMap<String, String> b = null;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<vi3> f23351a = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType;

        static {
            int[] iArr = new int[TaoPasswordShareType.values().length];
            $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType = iArr;
            try {
                iArr[TaoPasswordShareType.ShareTypeOther.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType[TaoPasswordShareType.ShareTypeQQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType[TaoPasswordShareType.ShareTypeWeixin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(666894366);
        t2o.a(665845795);
    }

    public static boolean c(Context context, TaoPasswordShareType taoPasswordShareType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bda6c1d8", new Object[]{context, taoPasswordShareType})).booleanValue();
        }
        int i = a.$SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType[taoPasswordShareType.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            return new InstalledPackages(context, "com.tencent.mm").installedApp();
        } else if (new InstalledPackages(context, "com.tencent.mobileqq").installedApp()) {
            return true;
        } else {
            return new InstalledPackages(context, "com.tencent.qqlite").installedApp();
        }
    }

    @Override // tb.smb
    public ArrayList<vi3> a(ArrayList<String> arrayList, Map<String, String> map) {
        vi3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("35073503", new Object[]{this, arrayList, map});
        }
        ArrayList<String> o = o(arrayList);
        f(o);
        this.f23351a.clear();
        Map<String, String> m = m(map);
        for (int i = 0; i < o.size(); i++) {
            String str = o.get(i);
            if (k(str) && (g = g(str)) != null) {
                if (m != null) {
                    g.r(m.get(str));
                }
                this.f23351a.add(g);
            }
        }
        return this.f23351a;
    }

    @Override // tb.smb
    public ArrayList<vi3> b(boolean z) {
        ArrayList<String> arrayList;
        vi3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1debcdea", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            arrayList = n();
        } else {
            arrayList = o(null);
        }
        f(arrayList);
        this.f23351a.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (k(str) && (g = g(str)) != null) {
                this.f23351a.add(g);
            }
        }
        return this.f23351a;
    }

    public void d(Map<String, String> map, List<GetPanelInfoResponseData.ChannelListBean> list, List<GetPanelInfoResponseData.ToolListBean> list2, boolean z) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70253a4c", new Object[]{this, map, list, list2, new Boolean(z)});
            return;
        }
        ArrayList arrayList = null;
        if (Localization.p()) {
            if (list == null || list.size() == 0) {
                if (list2 == null || list2.size() <= 0) {
                    a(null, map);
                    return;
                } else {
                    l(map, list2, z);
                    return;
                }
            }
        } else if (list == null || list.size() == 0) {
            this.f23351a.clear();
            if (list2 == null || list2.size() <= 0) {
                this.f23351a.add(g(ShareTargetType.Share2Copy.getValue()));
                return;
            } else {
                l(map, list2, z);
                return;
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<String> arrayList4 = new ArrayList<>();
        HashMap hashMap = new HashMap();
        for (GetPanelInfoResponseData.ChannelListBean channelListBean : list) {
            arrayList2.add(channelListBean.getType());
            if ("2".equals(channelListBean.getChannelSource())) {
                arrayList3.add(channelListBean.getType());
            } else {
                channelListBean.setChannelSource("1");
                arrayList4.add(channelListBean.getType());
            }
            hashMap.put(channelListBean.getType(), channelListBean);
        }
        ArrayList<String> o = o(arrayList4);
        f(o);
        if (kip.w()) {
            arrayList = arrayList3;
        }
        if (arrayList == null || arrayList.size() <= 0) {
            arrayList2 = o;
        } else {
            ArrayList arrayList5 = new ArrayList();
            Iterator<String> it = arrayList2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String next = it.next();
                if (!o.contains(next) && !arrayList.contains(next)) {
                    if (!h().containsKey(next) || !o.contains(h().get(next))) {
                        arrayList5.add(next);
                    } else if (arrayList2.size() > i2) {
                        arrayList2.set(i2, h().get(next));
                    }
                }
                i2++;
            }
            if (arrayList5.size() > 0) {
                arrayList2.removeAll(arrayList5);
            }
        }
        this.f23351a.clear();
        Map<String, String> m = m(map);
        p(hashMap);
        for (int i3 = 0; i3 < arrayList2.size(); i3 += i) {
            String str = arrayList2.get(i3);
            if ((!z || mip.i(str)) && k(str)) {
                vi3 g = g(str);
                if (g == null) {
                    GetPanelInfoResponseData.ChannelListBean channelListBean2 = (GetPanelInfoResponseData.ChannelListBean) hashMap.get(str);
                    if (channelListBean2 != null && "2".equals(channelListBean2.getChannelSource())) {
                        g = new vi3();
                    }
                }
                if (m != null) {
                    g.r(m.get(str));
                }
                if (hashMap.containsKey(str) && hashMap.get(str) != null) {
                    GetPanelInfoResponseData.ChannelListBean channelListBean3 = (GetPanelInfoResponseData.ChannelListBean) hashMap.get(str);
                    String icon = channelListBean3.getIcon();
                    String title = channelListBean3.getTitle();
                    String action = channelListBean3.getAction();
                    String channelSource = channelListBean3.getChannelSource();
                    g.x(str);
                    g.u(false);
                    if (!TextUtils.isEmpty(icon)) {
                        g.q(icon);
                    }
                    if (!TextUtils.isEmpty(title)) {
                        g.s(title);
                    }
                    if (!TextUtils.isEmpty(action)) {
                        g.v(action);
                    }
                    if ("2".equals(channelListBean3.getChannelSource())) {
                        g.m(channelSource);
                    } else {
                        g.m("1");
                    }
                    g.w(channelListBean3.getTopIcon());
                }
                this.f23351a.add(g);
                i = 1;
            }
        }
        l(m, list2, z);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e464a2c9", new Object[]{this});
            return;
        }
        ArrayList<vi3> arrayList = this.f23351a;
        if (arrayList != null && arrayList.size() > 0) {
            this.f23351a.clear();
            vi3 g = g(ShareTargetType.Share2Copy.getValue());
            if (g != null) {
                this.f23351a.add(g);
            }
        }
    }

    public final void f(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b539fc", new Object[]{this, arrayList});
            return;
        }
        ShareTargetType shareTargetType = ShareTargetType.Share2TaoPassword;
        if (arrayList.contains(shareTargetType.getValue())) {
            bwr.h().c = false;
            ShareTargetType shareTargetType2 = ShareTargetType.Share2Weixin;
            if (!arrayList.contains(shareTargetType2.getValue())) {
                arrayList.add(shareTargetType2.getValue());
            }
            arrayList.remove(shareTargetType.getValue());
        }
        if (!bwr.h().c) {
            ShareTargetType shareTargetType3 = ShareTargetType.Share2WeixinTimeline;
            if (arrayList.contains(shareTargetType3.getValue())) {
                arrayList.remove(shareTargetType3.getValue());
                ShareTargetType shareTargetType4 = ShareTargetType.Share2Weixin;
                if (!arrayList.contains(shareTargetType4.getValue())) {
                    arrayList.add(shareTargetType4.getValue());
                }
            }
        }
        if (!TextUtils.equals("item", bwr.h().o()) && !TextUtils.equals("guang", bwr.h().o())) {
            arrayList.remove(ShareTargetType.Share2IShopping.getValue());
            arrayList.remove(ShareTargetType.Share2IPresent.getValue());
        }
    }

    public final HashMap<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6cb98d31", new Object[]{this});
        }
        if (b == null) {
            HashMap<String, String> hashMap = new HashMap<>(44);
            b = hashMap;
            ShareTargetType shareTargetType = ShareTargetType.Share2Copy;
            hashMap.put(shareTargetType.getValue(), shareTargetType.getValue());
            b.put("1", shareTargetType.getValue());
            HashMap<String, String> hashMap2 = b;
            ShareTargetType shareTargetType2 = ShareTargetType.Share2SinaWeibo;
            hashMap2.put(shareTargetType2.getValue(), shareTargetType2.getValue());
            b.put("2", shareTargetType2.getValue());
            b.put(tn1.KEY_SHARE_CONFIG_SINAWEIBO, shareTargetType2.getValue());
            HashMap<String, String> hashMap3 = b;
            ShareTargetType shareTargetType3 = ShareTargetType.Share2Weixin;
            hashMap3.put(shareTargetType3.getValue(), shareTargetType3.getValue());
            b.put("3", shareTargetType3.getValue());
            HashMap<String, String> hashMap4 = b;
            ShareTargetType shareTargetType4 = ShareTargetType.Share2WeixinTimeline;
            hashMap4.put(shareTargetType4.getValue(), shareTargetType4.getValue());
            b.put("4", shareTargetType4.getValue());
            HashMap<String, String> hashMap5 = b;
            ShareTargetType shareTargetType5 = ShareTargetType.Share2QRCode;
            hashMap5.put(shareTargetType5.getValue(), shareTargetType5.getValue());
            b.put("5", shareTargetType5.getValue());
            HashMap<String, String> hashMap6 = b;
            ShareTargetType shareTargetType6 = ShareTargetType.Share2Wangxin;
            hashMap6.put(shareTargetType6.getValue(), shareTargetType6.getValue());
            b.put("6", shareTargetType6.getValue());
            HashMap<String, String> hashMap7 = b;
            ShareTargetType shareTargetType7 = ShareTargetType.Share2TaoPassword;
            hashMap7.put(shareTargetType7.getValue(), shareTargetType7.getValue());
            b.put("8", shareTargetType7.getValue());
            HashMap<String, String> hashMap8 = b;
            ShareTargetType shareTargetType8 = ShareTargetType.Share2Alipay;
            hashMap8.put(shareTargetType8.getValue(), shareTargetType8.getValue());
            b.put("10", shareTargetType8.getValue());
            HashMap<String, String> hashMap9 = b;
            ShareTargetType shareTargetType9 = ShareTargetType.Share2QQ;
            hashMap9.put(shareTargetType9.getValue(), shareTargetType9.getValue());
            b.put("13", shareTargetType9.getValue());
            HashMap<String, String> hashMap10 = b;
            ShareTargetType shareTargetType10 = ShareTargetType.Share2IShopping;
            hashMap10.put(shareTargetType10.getValue(), shareTargetType10.getValue());
            b.put("14", shareTargetType10.getValue());
            HashMap<String, String> hashMap11 = b;
            ShareTargetType shareTargetType11 = ShareTargetType.Share2IPresent;
            hashMap11.put(shareTargetType11.getValue(), shareTargetType11.getValue());
            b.put("16", shareTargetType11.getValue());
            HashMap<String, String> hashMap12 = b;
            ShareTargetType shareTargetType12 = ShareTargetType.Share2DingTalk;
            hashMap12.put(shareTargetType12.getValue(), shareTargetType12.getValue());
            b.put("17", shareTargetType12.getValue());
            HashMap<String, String> hashMap13 = b;
            ShareTargetType shareTargetType13 = ShareTargetType.Share2Contact;
            hashMap13.put("0", shareTargetType13.getValue());
            b.put(shareTargetType13.getValue(), shareTargetType13.getValue());
            HashMap<String, String> hashMap14 = b;
            ShareTargetType shareTargetType14 = ShareTargetType.Share2ScanCode;
            hashMap14.put(shareTargetType14.getValue(), shareTargetType14.getValue());
            b.put("18", shareTargetType14.getValue());
            HashMap<String, String> hashMap15 = b;
            ShareTargetType shareTargetType15 = ShareTargetType.Share2SMS;
            hashMap15.put(shareTargetType15.getValue(), shareTargetType15.getValue());
            HashMap<String, String> hashMap16 = b;
            ShareTargetType shareTargetType16 = ShareTargetType.Share2Messenger;
            hashMap16.put(shareTargetType16.getValue(), shareTargetType16.getValue());
            b.put("19", shareTargetType16.getValue());
            HashMap<String, String> hashMap17 = b;
            ShareTargetType shareTargetType17 = ShareTargetType.Share2Line;
            hashMap17.put(shareTargetType17.getValue(), shareTargetType17.getValue());
            b.put(ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE, shareTargetType17.getValue());
            HashMap<String, String> hashMap18 = b;
            ShareTargetType shareTargetType18 = ShareTargetType.Share2Telegram;
            hashMap18.put(shareTargetType18.getValue(), shareTargetType18.getValue());
            b.put(AgooConstants.REPORT_MESSAGE_NULL, shareTargetType18.getValue());
            HashMap<String, String> hashMap19 = b;
            ShareTargetType shareTargetType19 = ShareTargetType.Share2WeChat;
            hashMap19.put(shareTargetType19.getValue(), shareTargetType19.getValue());
            b.put(AgooConstants.REPORT_ENCRYPT_FAIL, shareTargetType19.getValue());
            HashMap<String, String> hashMap20 = b;
            ShareTargetType shareTargetType20 = ShareTargetType.Share2WhatsApp;
            hashMap20.put(shareTargetType20.getValue(), shareTargetType20.getValue());
            b.put(AgooConstants.REPORT_DUPLICATE_FAIL, shareTargetType20.getValue());
            HashMap<String, String> hashMap21 = b;
            ShareTargetType shareTargetType21 = ShareTargetType.Share2Instagram;
            hashMap21.put(shareTargetType21.getValue(), shareTargetType21.getValue());
            b.put(AgooConstants.REPORT_NOT_ENCRYPT, shareTargetType21.getValue());
            HashMap<String, String> hashMap22 = b;
            ShareTargetType shareTargetType22 = ShareTargetType.Share2Facebook;
            hashMap22.put(shareTargetType22.getValue(), shareTargetType22.getValue());
            b.put("25", shareTargetType22.getValue());
        }
        return b;
    }

    public ArrayList<vi3> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e2b3e5b2", new Object[]{this});
        }
        return this.f23351a;
    }

    public final void l(Map<String, String> map, List<GetPanelInfoResponseData.ToolListBean> list, boolean z) {
        vi3 vi3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371b4ab9", new Object[]{this, map, list, new Boolean(z)});
        } else if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                GetPanelInfoResponseData.ToolListBean toolListBean = list.get(i);
                String type = toolListBean.getType();
                if (!z || mip.i(type)) {
                    if (toolListBean.getToolSource() == null || "1".equals(toolListBean.getToolSource())) {
                        vi3Var = g(type);
                    } else if (kip.w() || !TextUtils.isEmpty(toolListBean.getToolUrl())) {
                        vi3Var = new vi3();
                        vi3Var.x(toolListBean.getType());
                        vi3Var.n(toolListBean.getTitle());
                        vi3Var.y(1);
                        vi3Var.u(true);
                        vi3Var.m("2");
                        vi3Var.v(toolListBean.getToolUrl());
                        vi3Var.t(JSON.toJSONString(toolListBean));
                    } else {
                        vi3Var = null;
                    }
                    if (vi3Var != null) {
                        if (!TextUtils.isEmpty(toolListBean.getTitle())) {
                            vi3Var.s(toolListBean.getTitle());
                        }
                        if (!TextUtils.isEmpty(toolListBean.getIcon())) {
                            vi3Var.q(toolListBean.getIcon());
                        }
                        if (map != null) {
                            vi3Var.r(map.get(type));
                        }
                        this.f23351a.add(vi3Var);
                    }
                }
            }
        }
    }

    public final Map<String, String> m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2ac8b85c", new Object[]{this, map});
        }
        if (map != null && map.containsKey(tn1.KEY_SHARE_CONFIG_SINAWEIBO)) {
            map.put(ShareTargetType.Share2SinaWeibo.getValue(), map.get(tn1.KEY_SHARE_CONFIG_SINAWEIBO));
        }
        return map;
    }

    public final ArrayList<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a8194ddb", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (Localization.p()) {
            arrayList.add(ShareTargetType.Share2Copy.getValue());
            arrayList.add(ShareTargetType.Share2QQ.getValue());
            arrayList.add(ShareTargetType.Share2Weixin.getValue());
            arrayList.add(ShareTargetType.Share2SinaWeibo.getValue());
            arrayList.add(ShareTargetType.Share2SMS.getValue());
            arrayList.add(ShareTargetType.Share2QRCode.getValue());
            arrayList.add(ShareTargetType.Share2ScanCode.getValue());
        } else {
            arrayList.add(ShareTargetType.Share2Copy.getValue());
            arrayList.add(ShareTargetType.Share2Messenger.getValue());
            arrayList.add(ShareTargetType.Share2Line.getValue());
            arrayList.add(ShareTargetType.Share2Telegram.getValue());
            arrayList.add(ShareTargetType.Share2WeChat.getValue());
            arrayList.add(ShareTargetType.Share2WhatsApp.getValue());
            arrayList.add(ShareTargetType.Share2Instagram.getValue());
            arrayList.add(ShareTargetType.Share2Facebook.getValue());
        }
        return arrayList;
    }

    public final ArrayList<String> o(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e5219523", new Object[]{this, arrayList});
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList == null || arrayList.size() == 0) {
            if (Localization.p()) {
                arrayList2.add(ShareTargetType.Share2Copy.getValue());
                arrayList2.add(ShareTargetType.Share2Weixin.getValue());
                arrayList2.add(ShareTargetType.Share2QQ.getValue());
                arrayList2.add(ShareTargetType.Share2SinaWeibo.getValue());
                arrayList2.add(ShareTargetType.Share2DingTalk.getValue());
                arrayList2.add(ShareTargetType.Share2Alipay.getValue());
                arrayList2.add(ShareTargetType.Share2QRCode.getValue());
                arrayList2.add(ShareTargetType.Share2ScanCode.getValue());
                arrayList2.add(ShareTargetType.Share2SMS.getValue());
            } else {
                arrayList2.add(ShareTargetType.Share2Copy.getValue());
                arrayList2.add(ShareTargetType.Share2Messenger.getValue());
                arrayList2.add(ShareTargetType.Share2Line.getValue());
                arrayList2.add(ShareTargetType.Share2Telegram.getValue());
                arrayList2.add(ShareTargetType.Share2WeChat.getValue());
                arrayList2.add(ShareTargetType.Share2WhatsApp.getValue());
                arrayList2.add(ShareTargetType.Share2Instagram.getValue());
                arrayList2.add(ShareTargetType.Share2Facebook.getValue());
            }
            return arrayList2;
        }
        HashMap<String, String> h = h();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = h.get(arrayList.get(i));
            if (!ShareTargetType.Share2Contact.getValue().equals(str) && !TextUtils.isEmpty(str) && !arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public final void p(Map<String, GetPanelInfoResponseData.ChannelListBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d25cb5", new Object[]{this, map});
        } else if (map != null && map.containsKey(tn1.KEY_SHARE_CONFIG_SINAWEIBO)) {
            map.put(ShareTargetType.Share2SinaWeibo.getValue(), map.get(tn1.KEY_SHARE_CONFIG_SINAWEIBO));
        }
    }

    public static vi3 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vi3) ipChange.ipc$dispatch("54ef518c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        vi3 vi3Var = new vi3();
        vi3Var.m("1");
        ShareTargetType shareTargetType = ShareTargetType.Share2Copy;
        if (shareTargetType.getValue().equals(str)) {
            int i = R.string.taobao_app_1010_1_17829;
            vi3Var.s(Localization.q(i));
            vi3Var.x(shareTargetType.getValue());
            vi3Var.p(-1);
            vi3Var.q("https://gw.alicdn.com/imgextra/i2/O1CN01dCbyFl1lyIEzcuYjO_!!6000000004887-2-tps-192-192.png");
            vi3Var.y(1);
            vi3Var.u(true);
            vi3Var.n(Localization.q(i));
            return vi3Var;
        }
        ShareTargetType shareTargetType2 = ShareTargetType.Share2HUABAO;
        if (shareTargetType2.getValue().equals(str)) {
            int i2 = R.string.share_save_image;
            vi3Var.s(Localization.q(i2));
            vi3Var.x(shareTargetType2.getValue());
            vi3Var.p(-1);
            vi3Var.q("https://gw.alicdn.com/imgextra/i4/O1CN013yK1eS1Lsdd57p6jC_!!6000000001355-2-tps-192-192.png");
            vi3Var.y(1);
            vi3Var.u(true);
            vi3Var.n(Localization.q(i2));
            return vi3Var;
        }
        ShareTargetType shareTargetType3 = ShareTargetType.Share2SinaWeibo;
        if (shareTargetType3.getValue().equals(str) || TextUtils.equals(str, tn1.KEY_SHARE_CONFIG_SINAWEIBO)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17877));
            vi3Var.x(shareTargetType3.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.tb_share_weibo);
            vi3Var.q("https://img.alicdn.com/tfs/TB11VY0d8Cw3KVjSZFlXXcJkFXa-180-180.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17868));
            return vi3Var;
        }
        ShareTargetType shareTargetType4 = ShareTargetType.Share2Weixin;
        if (shareTargetType4.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17850));
            vi3Var.x(shareTargetType4.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_wechat_session);
            vi3Var.q("https://gw.alicdn.com/imgextra/i3/O1CN01Hi2Ibp29kbAxiy69i_!!6000000008106-2-tps-192-192.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17859));
            return vi3Var;
        }
        ShareTargetType shareTargetType5 = ShareTargetType.Share2WeixinTimeline;
        if (shareTargetType5.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17864));
            vi3Var.x(shareTargetType5.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_wechat_timeline);
            vi3Var.q("https://gw.alicdn.com/tfs/TB1zxE9eNn1gK0jSZKPXXXvUXXa-192-192.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17837));
            return vi3Var;
        }
        ShareTargetType shareTargetType6 = ShareTargetType.Share2QRCode;
        if (shareTargetType6.getValue().equals(str)) {
            int i3 = R.string.taobao_app_1010_1_17856;
            vi3Var.s(Localization.q(i3));
            vi3Var.x(shareTargetType6.getValue());
            vi3Var.o(-1);
            vi3Var.q("https://gw.alicdn.com/tfs/TB1ja83dGmWBuNjy1XaXXXCbXXa-108-108.png");
            vi3Var.p(-1);
            vi3Var.y(1);
            vi3Var.u(true);
            vi3Var.n(Localization.q(i3));
            return vi3Var;
        }
        ShareTargetType shareTargetType7 = ShareTargetType.Share2ScanCode;
        if (shareTargetType7.getValue().equals(str)) {
            int i4 = R.string.taobao_app_1010_1_17883;
            vi3Var.s(Localization.q(i4));
            vi3Var.x(shareTargetType7.getValue());
            vi3Var.o(-1);
            vi3Var.q("https://gw.alicdn.com/tfs/TB1yW0MdKSSBuNjy0FlXXbBpVXa-108-108.png");
            vi3Var.p(-1);
            vi3Var.y(1);
            vi3Var.u(true);
            vi3Var.n(Localization.q(i4));
            return vi3Var;
        }
        ShareTargetType shareTargetType8 = ShareTargetType.Share2Wangxin;
        if (shareTargetType8.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17845));
            vi3Var.x(shareTargetType8.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_wangxin);
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17834));
            return vi3Var;
        }
        ShareTargetType shareTargetType9 = ShareTargetType.Share2TaoPassword;
        if (shareTargetType9.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17850));
            vi3Var.x(shareTargetType9.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_wechat_session);
            vi3Var.q("https://gw.alicdn.com/tfs/TB1nv0BdFGWBuNjy0FbXXb4sXXa-162-162.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17859));
            return vi3Var;
        }
        ShareTargetType shareTargetType10 = ShareTargetType.Share2Alipay;
        if (shareTargetType10.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17875));
            vi3Var.x(shareTargetType10.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_alipay);
            vi3Var.q("https://img.alicdn.com/tfs/TB1B8LTd8OD3KVjSZFFXXcn9pXa-180-180.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17840));
            return vi3Var;
        }
        ShareTargetType shareTargetType11 = ShareTargetType.Share2QQ;
        if (shareTargetType11.getValue().equals(str)) {
            vi3Var.s("QQ");
            vi3Var.x(shareTargetType11.getValue());
            vi3Var.o(-1);
            vi3Var.q("https://gw.alicdn.com/imgextra/i3/O1CN01lxXIWh1DesW4ASFYs_!!6000000000242-2-tps-192-192.png");
            vi3Var.p(R.drawable.share_qq);
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17852));
            return vi3Var;
        }
        ShareTargetType shareTargetType12 = ShareTargetType.Share2IShopping;
        if (shareTargetType12.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17830));
            vi3Var.x(shareTargetType12.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_ishopping);
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17854));
            return vi3Var;
        }
        ShareTargetType shareTargetType13 = ShareTargetType.Share2DingTalk;
        if (shareTargetType13.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17833));
            vi3Var.x(shareTargetType13.getValue());
            vi3Var.o(-1);
            vi3Var.p(R.drawable.share_dingtalk);
            vi3Var.q("https://img.alicdn.com/tfs/TB1qAT1d8Cw3KVjSZR0XXbcUpXa-180-180.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17828));
            return vi3Var;
        }
        ShareTargetType shareTargetType14 = ShareTargetType.Share2IPresent;
        if (shareTargetType14.getValue().equals(str)) {
            int i5 = R.string.taobao_app_1010_1_17843;
            vi3Var.s(Localization.q(i5));
            vi3Var.x(shareTargetType14.getValue());
            vi3Var.p(-1);
            vi3Var.y(1);
            vi3Var.n(Localization.q(i5));
            return vi3Var;
        }
        ShareTargetType shareTargetType15 = ShareTargetType.Share2SMS;
        if (shareTargetType15.getValue().equals(str)) {
            vi3Var.s(Localization.q(R.string.taobao_app_1010_1_17844));
            vi3Var.x(shareTargetType15.getValue());
            vi3Var.p(R.drawable.share_sms);
            vi3Var.o(-1);
            vi3Var.q("https://img.alicdn.com/tfs/TB1CRrZd8Kw3KVjSZFOXXarDVXa-180-180.png");
            vi3Var.y(2);
            vi3Var.n(Localization.q(R.string.taobao_app_1010_1_17846));
            return vi3Var;
        }
        ShareTargetType shareTargetType16 = ShareTargetType.Share2Messenger;
        if (!shareTargetType16.getValue().equals(str) || Localization.p()) {
            ShareTargetType shareTargetType17 = ShareTargetType.Share2Line;
            if (!shareTargetType17.getValue().equals(str) || Localization.p()) {
                ShareTargetType shareTargetType18 = ShareTargetType.Share2Telegram;
                if (!shareTargetType18.getValue().equals(str) || Localization.p()) {
                    ShareTargetType shareTargetType19 = ShareTargetType.Share2WeChat;
                    if (!shareTargetType19.getValue().equals(str) || Localization.p()) {
                        ShareTargetType shareTargetType20 = ShareTargetType.Share2WhatsApp;
                        if (!shareTargetType20.getValue().equals(str) || Localization.p()) {
                            ShareTargetType shareTargetType21 = ShareTargetType.Share2Instagram;
                            if (!shareTargetType21.getValue().equals(str) || Localization.p()) {
                                ShareTargetType shareTargetType22 = ShareTargetType.Share2Facebook;
                                if (!shareTargetType22.getValue().equals(str) || Localization.p()) {
                                    return null;
                                }
                                vi3Var.s("Facebook");
                                vi3Var.x(shareTargetType22.getValue());
                                vi3Var.o(-1);
                                vi3Var.q("https://gw.alicdn.com/imgextra/i2/O1CN01YTKiHv1Q4KCN6dTMR_!!6000000001922-2-tps-192-192.png");
                                vi3Var.y(2);
                                vi3Var.n("Share to Facebook");
                                return vi3Var;
                            }
                            vi3Var.s("Instagram");
                            vi3Var.x(shareTargetType21.getValue());
                            vi3Var.o(-1);
                            vi3Var.q("https://gw.alicdn.com/imgextra/i3/O1CN01d7dTB01SK0zyXoEGL_!!6000000002227-2-tps-192-192.png");
                            vi3Var.y(2);
                            vi3Var.n("Share to Instagram");
                            return vi3Var;
                        }
                        vi3Var.s("WhatsApp");
                        vi3Var.x(shareTargetType20.getValue());
                        vi3Var.o(-1);
                        vi3Var.q("https://gw.alicdn.com/imgextra/i1/O1CN01AbH0Ds1wrqjJCBzyD_!!6000000006362-2-tps-192-192.png");
                        vi3Var.y(2);
                        vi3Var.n("Share to WhatsApp");
                        return vi3Var;
                    }
                    vi3Var.s("WeChat");
                    vi3Var.x(shareTargetType19.getValue());
                    vi3Var.o(-1);
                    vi3Var.q("https://gw.alicdn.com/imgextra/i1/O1CN01Ztg1he1MMrleXo8QU_!!6000000001421-2-tps-192-192.png");
                    vi3Var.y(2);
                    vi3Var.n("Share to WeChat");
                    return vi3Var;
                }
                vi3Var.s("Telegram");
                vi3Var.x(shareTargetType18.getValue());
                vi3Var.o(-1);
                vi3Var.q("https://gw.alicdn.com/imgextra/i3/O1CN01kxgkLg26SnDiBGxHW_!!6000000007661-2-tps-192-192.png");
                vi3Var.y(2);
                vi3Var.n("Share to Telegram");
                return vi3Var;
            }
            vi3Var.s("Line");
            vi3Var.x(shareTargetType17.getValue());
            vi3Var.o(-1);
            vi3Var.q("https://img.alicdn.com/imgextra/i1/O1CN01sXejBA1S1hA9Fovxa_!!6000000002187-2-tps-192-192.png");
            vi3Var.y(2);
            vi3Var.n("Share to Line");
            return vi3Var;
        }
        vi3Var.s("Messenger");
        vi3Var.x(shareTargetType16.getValue());
        vi3Var.o(-1);
        vi3Var.q("https://gw.alicdn.com/imgextra/i4/O1CN01TnCti81khyo53VjdA_!!6000000004716-2-tps-192-192.png");
        vi3Var.y(2);
        vi3Var.n("Share to Messenger");
        return vi3Var;
    }

    public void j(TBShareContent tBShareContent) {
        List list;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48fc04ba", new Object[]{this, tBShareContent});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            List arrayList2 = new ArrayList();
            String str = "";
            if (TextUtils.equals(tBShareContent.templateId, "detail")) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tBShareContent.imageUrl);
                hashMap.put("images", arrayList3);
                String str2 = tBShareContent.description;
                if (str2 == null) {
                    str2 = str;
                }
                hashMap.put("title", str2);
                Map<String, String> map = tBShareContent.extraParams;
                if (map != null) {
                    str = map.get("price");
                }
                hashMap.put("price", str);
                Map<String, Object> map2 = tBShareContent.templateParams;
                if (!(map2 == null || map2.size() == 0)) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        arrayList2 = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (arrayList2.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("price"))) {
                        tBShareContent.templateParams.put("price", hashMap.get("price"));
                        return;
                    }
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
                return;
            }
            List list2 = arrayList2;
            if (TextUtils.equals(tBShareContent.templateId, "live")) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(tBShareContent.imageUrl);
                hashMap.put("images", arrayList4);
                Map<String, String> map3 = tBShareContent.businessInfo;
                hashMap.put("title", map3 == null ? str : map3.get("title"));
                Map<String, String> map4 = tBShareContent.businessInfo;
                hashMap.put("price", map4 == null ? str : map4.get("bottomText"));
                Map<String, String> map5 = tBShareContent.businessInfo;
                hashMap.put("headImg", map5 == null ? str : map5.get("topLogo"));
                Map<String, String> map6 = tBShareContent.businessInfo;
                hashMap.put("userNick", map6 == null ? str : map6.get("topTitle"));
                Map<String, String> map7 = tBShareContent.businessInfo;
                hashMap.put("statusIcon", map7 == null ? str : map7.get("bottomLogo"));
                Map<String, String> map8 = tBShareContent.businessInfo;
                hashMap.put("brandIcon", map8 == null ? str : map8.get("descriptionImage"));
                Map<String, Object> map9 = tBShareContent.templateParams;
                if (!(map9 == null || map9.size() == 0)) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        list2 = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (list2.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("price"))) {
                        tBShareContent.templateParams.put("price", hashMap.get("price"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("headImg"))) {
                        tBShareContent.templateParams.put("headImg", hashMap.get("headImg"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("userNick"))) {
                        tBShareContent.templateParams.put("userNick", hashMap.get("userNick"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("statusIcon"))) {
                        tBShareContent.templateParams.put("statusIcon", hashMap.get("statusIcon"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("brandIcon"))) {
                        tBShareContent.templateParams.put("brandIcon", hashMap.get("brandIcon"));
                        return;
                    }
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
            } else if (TextUtils.equals(tBShareContent.templateId, "shop")) {
                ArrayList arrayList5 = new ArrayList();
                Map<String, String> map10 = tBShareContent.businessInfo;
                arrayList5.add(map10 == null ? str : map10.get("imageleft"));
                Map<String, String> map11 = tBShareContent.businessInfo;
                arrayList5.add(map11 == null ? str : map11.get("imageRight1"));
                Map<String, String> map12 = tBShareContent.businessInfo;
                arrayList5.add(map12 == null ? str : map12.get("imageRight2"));
                hashMap.put("images", arrayList5);
                Map<String, String> map13 = tBShareContent.businessInfo;
                hashMap.put("title", map13 == null ? str : map13.get("shopName"));
                Map<String, String> map14 = tBShareContent.businessInfo;
                hashMap.put("brandIcon", map14 == null ? str : map14.get("shopLogo"));
                Map<String, String> map15 = tBShareContent.businessInfo;
                hashMap.put("levelIcon", map15 == null ? str : map15.get("shopLevel"));
                Map<String, String> map16 = tBShareContent.businessInfo;
                if (map16 == null || map16.get("bottomDesc") == null) {
                    hashMap.put("tags", new ArrayList());
                } else {
                    hashMap.put("tags", JSON.parseArray(String.valueOf(tBShareContent.businessInfo.get("bottomDesc")), String.class));
                }
                Map<String, Object> map17 = tBShareContent.templateParams;
                if (!(map17 == null || map17.size() == 0)) {
                    if (tBShareContent.templateParams.get("images") == null || !(tBShareContent.templateParams.get("images") instanceof String)) {
                        list = (tBShareContent.templateParams.get("images") == null || !(tBShareContent.templateParams.get("images") instanceof JSONArray)) ? list2 : JSON.parseArray(JSON.toJSONString(tBShareContent.templateParams.get("images")), String.class);
                    } else {
                        list = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (list.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("brandIcon"))) {
                        tBShareContent.templateParams.put("brandIcon", hashMap.get("brandIcon"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("levelIcon"))) {
                        tBShareContent.templateParams.put("levelIcon", hashMap.get("levelIcon"));
                    }
                    try {
                        arrayList = (ArrayList) tBShareContent.templateParams.get("tags");
                    } catch (Throwable unused) {
                        arrayList = null;
                    }
                    if (arrayList == null && (tBShareContent.templateParams.get("tags") instanceof String)) {
                        try {
                            arrayList = (ArrayList) JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("tags")), String.class);
                        } catch (Throwable unused2) {
                        }
                    }
                    if (arrayList == null || arrayList.size() == 0) {
                        tBShareContent.templateParams.put("tags", hashMap.get("tags"));
                        return;
                    }
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
            } else if (TextUtils.equals(tBShareContent.templateId, "group")) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(tBShareContent.imageUrl);
                hashMap.put("images", arrayList6);
                Map<String, String> map18 = tBShareContent.businessInfo;
                hashMap.put("title", map18 == null ? str : map18.get("groupDesc"));
                Map<String, String> map19 = tBShareContent.businessInfo;
                hashMap.put("price", map19 == null ? str : map19.get("groupFlag"));
                Map<String, String> map20 = tBShareContent.businessInfo;
                hashMap.put("headImg", map20 == null ? str : map20.get("groupImage"));
                Map<String, String> map21 = tBShareContent.businessInfo;
                hashMap.put("userNick", map21 == null ? str : map21.get("groupName"));
                hashMap.put("brandIcon", String.valueOf(R.drawable.share_group_icon));
                Map<String, String> map22 = tBShareContent.businessInfo;
                hashMap.put("description", map22 == null ? str : map22.get("groupVister"));
                Map<String, Object> map23 = tBShareContent.templateParams;
                if (!(map23 == null || map23.size() == 0)) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        list2 = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (list2.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("price"))) {
                        tBShareContent.templateParams.put("price", hashMap.get("price"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("headImg"))) {
                        tBShareContent.templateParams.put("headImg", hashMap.get("headImg"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("userNick"))) {
                        tBShareContent.templateParams.put("userNick", hashMap.get("userNick"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("brandIcon"))) {
                        tBShareContent.templateParams.put("brandIcon", hashMap.get("brandIcon"));
                    }
                    if (TextUtils.isEmpty((String) tBShareContent.templateParams.get("description"))) {
                        tBShareContent.templateParams.put("description", hashMap.get("description"));
                        return;
                    }
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
            } else if (TextUtils.equals(tBShareContent.templateId, "weex")) {
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(tBShareContent.templateParams);
                hashMap2.put("extParams", hashMap3);
                TLog.loge("ChannelBusiness", "weex layoutid");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa1830e", new Object[]{this, str})).booleanValue();
        }
        gpd shareChannel = ShareBizAdapter.getInstance().getShareChannel();
        if (ShareTargetType.Share2Copy.getValue().equals(str)) {
            return ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.Copy) && tn1.n("copy");
        }
        if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            Context g = bwr.h().g();
            ShareAppRegister.registerWeibo(shareChannel.d(), shareChannel.e());
            return ShareApi.getInstance().canShare(g, SharePlatform.SinaWeibo) && tn1.n(tn1.KEY_SHARE_CONFIG_SINAWEIBO);
        } else if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            return new InstalledPackages(bwr.h().g(), "com.tencent.mm").installedApp() && tn1.n(tn1.KEY_SHARE_CONFIG_WEIXIN);
        } else {
            if (ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
                return new InstalledPackages(bwr.h().g(), "com.tencent.mm").installedApp() && tn1.n(tn1.KEY_SHARE_CONFIG_WEIXINTIMELINE);
            }
            if (ShareTargetType.Share2QRCode.getValue().equals(str) || ShareTargetType.Share2ScanCode.getValue().equals(str)) {
                return tn1.n("qrcode");
            }
            if (ShareTargetType.Share2Wangxin.getValue().equals(str)) {
                Context g2 = bwr.h().g();
                ShareAppRegister.registerWangxin(shareChannel.f());
                return ShareApi.getInstance().canShare(g2, SharePlatform.Wangxin) && tn1.n(tn1.KEY_SHARE_CONFIG_WANGXIN);
            } else if (ShareTargetType.Share2TaoPassword.getValue().equals(str)) {
                return tn1.n("taopassword") && c(bwr.h().g(), TaoPasswordShareType.ShareTypeWeixin);
            } else if (ShareTargetType.Share2Alipay.getValue().equals(str)) {
                Context g3 = bwr.h().g();
                ShareAppRegister.registerAlipay(shareChannel.c());
                return ShareApi.getInstance().canShare(g3, SharePlatform.Alipay) && tn1.n("alipay");
            } else if (ShareTargetType.Share2QQ.getValue().equals(str)) {
                return tn1.n("qq") && c(bwr.h().g(), TaoPasswordShareType.ShareTypeQQ);
            } else if (ShareTargetType.Share2IShopping.getValue().equals(str)) {
                return tn1.n(tn1.KEY_SHARE_CONFIG_ISHOPPING);
            } else {
                if (ShareTargetType.Share2DingTalk.getValue().equals(str)) {
                    Context g4 = bwr.h().g();
                    ShareAppRegister.registerDingTalk(shareChannel.a());
                    return tn1.n("dingtalk") && ShareApi.getInstance().canShare(g4, SharePlatform.DingTalk);
                } else if (ShareTargetType.Share2IPresent.getValue().equals(str)) {
                    return tn1.n(tn1.KEY_SHARE_CONFIG_IPRESENT);
                } else {
                    if (ShareTargetType.Share2SMS.getValue().equals(str)) {
                        return tn1.n("sms");
                    }
                    if (ShareTargetType.Share2Messenger.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.Messenger);
                    } else if (ShareTargetType.Share2Line.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.Line);
                    } else if (ShareTargetType.Share2Telegram.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.Telegram);
                    } else if (ShareTargetType.Share2WeChat.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.WeChat);
                    } else if (ShareTargetType.Share2WhatsApp.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.WhatsApp);
                    } else if (ShareTargetType.Share2Instagram.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.Instagram);
                    } else if (ShareTargetType.Share2Facebook.getValue().equals(str)) {
                        return !Localization.p() && ShareApi.getInstance().canShare(bwr.h().g(), SharePlatform.Facebook);
                    } else if (!TextUtils.isEmpty(str)) {
                        return tn1.n(str);
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}
