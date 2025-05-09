package com.taobao.message.util;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.nav.InterceptChatProcessor;
import com.taobao.message.nav.SubNavProcessor;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.t2o;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageNavProcessorV2 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEGRADE_WW = "isDegrade2H5";
    public static final String KEY_BC_NICK = "sellerNick";
    public static final String KEY_BC_TAOBAO = "cntaobao";
    public static final String KEY_BIZ_CONFIG_CODE = "bizConfigCode";
    public static final String KEY_BIZ_CONFIG_TYPE = "bizConfigType";
    public static final String KEY_DATASOURCE_TYPE = "datasourceType";
    public static final String NAV_URL_MSG_CENTER_CATEGORY = "http://m.taobao.com/go/msgcentercategory";
    public static final String NAV_URL_MSG_ROUTE_ACTIVITY = "http://tb.cn/n/im/route";
    public static final String OUTE_URL_WW_OLDCHAT_2 = "im.m.taobao.com/ww/ad_ww_dialog.htm";
    public static final String OUTE_URL_WW_OLDCHAT_3 = "tb.cn/n/ww/chat";
    public static final String OUTE_URL_WW_OLDCHAT_4 = "h5.m.taobao.com/ww/index.htm";
    public static final String OUTE_URL_WW_OLDCHAT_DETAIL = "im.m.taobao.com/ww/wap_ww_my.htm";
    public static final String ROUTE_URL_AURA_POP = "com.taobao.message/auraPop";
    public static final String ROUTE_URL_CHAT = "tb.cn/n/im/chat";
    public static final String ROUTE_URL_CHAT_FOR_LIGHT_SHOP = "h5.m.taobao.com/wx/h5chat.html";
    public static final String ROUTE_URL_CHAT_FOR_LIGHT_SHOP_PRE = "wapp.m.taobao.com/wx/h5chat.html";
    public static final String ROUTE_URL_CHAT_FOR_TAO_SH = "market.m.taobao.com/app/tb-chatting/tbms-chat/pages/index";
    public static final String ROUTE_URL_CHAT_FOR_TAO_SH_PRE = "market.wapa.taobao.com/app/tb-chatting/tbms-chat/pages/index";
    public static final String ROUTE_URL_CHAT_MINIAPP = "market.m.taobao.com/app/tb-chatting/chat-universal-page/pages/index/index.html";
    public static final String ROUTE_URL_CHAT_MINIAPP_PRE = "market.wapa.taobao.com/app/tb-chatting/chat-universal-page/pages/index/index.html";
    public static final String ROUTE_URL_DTALK = "tb.cn/n/dt/chat";
    public static final String ROUTE_URL_FOLDER_NEW = "m.taobao.com/message/categorylist";
    public static final String ROUTE_URL_FOLDER_OLD = "message/categorylist";
    public static final String ROUTE_URL_GROUPLIST = "tb.cn/n/im/group/group_list";
    public static final String ROUTE_URL_GROUP_CHAT = "tb.cn/n/im/group/newchat";
    public static final String ROUTE_URL_IMBA_CHAT = "http://tb.cn/n/ww/official";
    public static final String ROUTE_URL_INNER_IMBA_CHAT = "http://tb.cn/n/ww/inner/official";
    public static final String ROUTE_URL_MESSAGETAB = "taobao://message/root";
    public static final String ROUTE_URL_MESSAGE_LIST = "com.taobao.taobao/message_list";
    public static final String ROUTE_URL_NEW_CHAT = "tb.cn/n/im/dynamic/chat.html";
    public static final String ROUTE_URL_NEW_LITE_CHAT = "tb.cn/n/im/dynamic/quickchat.html";
    public static final String ROUTE_URL_NEW_LITE_CHAT2 = "tb.cn/n/im/chatlayer";
    public static final String ROUTE_URL_NEW_LITE_CHAT3 = "com.taobao.taobao/messagelayer";
    public static final String ROUTE_URL_OFFICIAL = "tb.cn/n/ww/official";
    public static final String ROUTE_URL_OFFICIAL_INNER = "tb.cn/n/ww/inner/official";
    public static final String ROUTE_URL_OFFICIAL_INNER_OLD = "tb.cn/n/ww/inner/official_old";
    public static final String ROUTE_URL_OFFICIAL_OLD = "tb.cn/n/ww/official_old";
    public static final String ROUTE_URL_WW_CHAT_DETAIL = "tb.cn/n/ww/chatdetail";
    public static final String ROUTE_URL_WW_NEWCHAT = "tb.cn/n/ww/newchat";
    public static final String ROUTE_URL_XIAOMI_TALKING = "ai.alimebot.taobao.com/vgbot/index.htm";
    public static final String ROUTE_URL_XIAOMI_TALKING_PRE = "pre-ai.alimebot.taobao.com/vgbot/index.htm";
    public static final String SOURCE_DETAIL = "goods";
    public static final String SOURCE_SHOP = "shop";
    private static final String TAG = "MessageNavPreprocessor";
    private static InterceptChatProcessor subInterceptProcessors;
    private static Set<String> subNavClazz = new HashSet(Arrays.asList("com.taobao.message.util.SubMessageNavProcessor"));
    private static final Set<SubNavProcessor> subNavProcessors = new HashSet();
    private static String sInterceptChatUrl = LoadingChatActivity.LOAD_CHAT_URL;

    static {
        t2o.a(530579504);
        t2o.a(578814049);
        setInterceptChatProcessor(new SimpleChatInterceptProcessor());
    }

    private void checkNeedLoadSubNav() {
        if (isEmpty(subNavProcessors) && !isEmpty(subNavClazz) && BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            for (String str : subNavClazz) {
                try {
                    Object newInstance = Class.forName(str).newInstance();
                    if (newInstance instanceof SubNavProcessor) {
                        subNavProcessors.add((SubNavProcessor) newInstance);
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InstantiationException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    private static boolean isEmpty(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void setInterceptChatProcessor(InterceptChatProcessor interceptChatProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919b01", new Object[]{interceptChatProcessor});
        } else {
            subInterceptProcessors = interceptChatProcessor;
        }
    }

    public static void setSubNavClazz(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cad68e5", new Object[]{set});
        } else {
            subNavClazz = set;
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "MessageNavProcessorV2";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private boolean checkNeedLoadingChat(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8315c5e", new Object[]{this, intent})).booleanValue();
        }
        if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            return false;
        }
        String uri = intent.getData().toString();
        intent.putExtra("originalUrl", uri);
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(uri);
        for (String str2 : parse.getQueryParameterNames()) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        InterceptChatProcessor interceptChatProcessor = subInterceptProcessors;
        if (interceptChatProcessor != null) {
            str = interceptChatProcessor.getUrl(intent);
        } else {
            str = LoadingChatActivity.LOAD_CHAT_URL;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : hashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        intent.setData(buildUpon.build());
        return true;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (ApplicationUtil.getApplication() == null) {
            ApplicationUtil.setApplication(Globals.getApplication());
        }
        if (intent == null || intent.getData() == null) {
            return true;
        }
        Uri data = intent.getData();
        checkNeedLoadSubNav();
        try {
            String str = data.getHost() + data.getPath();
            switch (str.hashCode()) {
                case -1819339902:
                    if (str.equals(OUTE_URL_WW_OLDCHAT_4)) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1600749622:
                    if (str.equals(ROUTE_URL_NEW_LITE_CHAT)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1534641910:
                    if (str.equals(OUTE_URL_WW_OLDCHAT_2)) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1322584914:
                    if (str.equals(ROUTE_URL_WW_NEWCHAT)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -379976202:
                    if (str.equals(ROUTE_URL_CHAT_FOR_TAO_SH)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -196408843:
                    if (str.equals(ROUTE_URL_OFFICIAL)) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -116199922:
                    if (str.equals(ROUTE_URL_OFFICIAL_INNER)) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -38185137:
                    if (str.equals(ROUTE_URL_CHAT_FOR_LIGHT_SHOP_PRE)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 3284676:
                    if (str.equals(ROUTE_URL_CHAT_FOR_TAO_SH_PRE)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 46898739:
                    if (str.equals(ROUTE_URL_WW_CHAT_DETAIL)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 65804130:
                    if (str.equals(OUTE_URL_WW_OLDCHAT_3)) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 93026347:
                    if (str.equals(ROUTE_URL_NEW_CHAT)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 239362974:
                    if (str.equals(ROUTE_URL_CHAT)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 297215922:
                    if (str.equals(ROUTE_URL_DTALK)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 556276964:
                    if (str.equals(ROUTE_URL_MESSAGE_LIST)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 567969976:
                    if (str.equals(ROUTE_URL_NEW_LITE_CHAT3)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 944291666:
                    if (str.equals(ROUTE_URL_CHAT_FOR_LIGHT_SHOP)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 987632758:
                    if (str.equals(ROUTE_URL_OFFICIAL_INNER_OLD)) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 1069483123:
                    if (str.equals(ROUTE_URL_NEW_LITE_CHAT2)) {
                        break;
                    }
                    c = 65535;
                    break;
                case 1665656029:
                    if (str.equals(ROUTE_URL_OFFICIAL_OLD)) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1751175138:
                    if (str.equals(ROUTE_URL_GROUP_CHAT)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1843213081:
                    if (str.equals(OUTE_URL_WW_OLDCHAT_DETAIL)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    if (checkNeedLoadingChat(intent)) {
                        return true;
                    }
                    break;
            }
            Set<SubNavProcessor> set = subNavProcessors;
            if (isEmpty(set)) {
                return true;
            }
            boolean z = true;
            for (SubNavProcessor subNavProcessor : set) {
                z = subNavProcessor.process(intent, zmjVar);
            }
            return z;
        } catch (Throwable unused) {
            return true;
        }
    }
}
