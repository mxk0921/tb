package com.taobao.taolive.adapterimpl.nav;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.business.BusinessUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONException;
import tb.air;
import tb.b0d;
import tb.bia;
import tb.fee;
import tb.fkx;
import tb.geb;
import tb.itw;
import tb.jbt;
import tb.kzb;
import tb.o3s;
import tb.qbf;
import tb.qfa;
import tb.rbu;
import tb.sbt;
import tb.sjr;
import tb.t2o;
import tb.to8;
import tb.tsd;
import tb.up6;
import tb.ux9;
import tb.uyv;
import tb.v2s;
import tb.v7t;
import tb.vc;
import tb.vx9;
import tb.xbf;
import tb.xts;
import tb.yqq;
import tb.z9u;
import tb.zga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoLiveActionUtils implements geb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f12994a = sbt.A();
    public final boolean b = sbt.e();
    public final boolean c = sbt.f();
    public final boolean d = sbt.m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux9 f12995a;
        public final /* synthetic */ String b;
        public final /* synthetic */ LiveItem c;

        public a(TaoLiveActionUtils taoLiveActionUtils, ux9 ux9Var, String str, LiveItem liveItem) {
            this.f12995a = ux9Var;
            this.b = str;
            this.c = liveItem;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            rbu.L(this.f12995a, "gotoCartForTaoke", "accountId=" + this.b, z9u.ARG_TAOKE_BIZTYPE + this.c.extendVal.bizType, "itemId=" + this.c.itemId, "mtopSuccess=false");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            rbu.L(this.f12995a, "gotoCartForTaoke", "accountId=" + this.b, z9u.ARG_TAOKE_BIZTYPE + this.c.extendVal.bizType, "itemId=" + this.c.itemId, "mtopSuccess=true");
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            rbu.L(this.f12995a, "gotoCartForTaoke", "accountId=" + this.b, z9u.ARG_TAOKE_BIZTYPE + this.c.extendVal.bizType, "itemId=" + this.c.itemId, "mtopSuccess=false");
        }
    }

    static {
        t2o.a(779092361);
        t2o.a(806354962);
    }

    public static String A(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b630cde", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        int indexOf = str.indexOf(str2 + "=");
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf));
        sb.append(str2 + "=");
        sb.append(str3);
        int indexOf2 = str.indexOf("&", indexOf);
        if (indexOf2 != -1) {
            sb.append(str.substring(indexOf2));
        }
        return sb.toString();
    }

    public static /* synthetic */ void d(TaoLiveActionUtils taoLiveActionUtils, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1c3703", new Object[]{taoLiveActionUtils, contentBusinessModel});
        } else {
            taoLiveActionUtils.y(contentBusinessModel);
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f8506b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enablePVIDParams", "false"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8657af", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSpmLiveSourceParams", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("431f71d9", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableTCPParams", "false"));
    }

    public static Fragment s(ux9 ux9Var) {
        jbt jbtVar;
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d6b191eb", new Object[]{ux9Var});
        }
        if (!(ux9Var instanceof air)) {
            return null;
        }
        air airVar = (air) ux9Var;
        if (airVar.A() == null || (jbtVar = airVar.A().taoliveOpenContext) == null || (map = jbtVar.f) == null || (obj = map.get("goDetailFragment")) == null) {
            return null;
        }
        return (Fragment) obj;
    }

    public static void x(Activity activity, ux9 ux9Var, String str, int i) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eaba0d5", new Object[]{activity, ux9Var, str, new Integer(i)});
            return;
        }
        if (ux9Var != null) {
            fragment = s(ux9Var);
        } else {
            fragment = null;
        }
        if (fragment != null) {
            Nav.from(activity).withFragment(fragment).forResult(i).toUri(str);
        } else {
            Nav.from(activity).forResult(i).toUri(str);
        }
    }

    public JSONObject B(ux9 ux9Var, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("837870f6", new Object[]{this, ux9Var, liveItem, map});
        }
        JSONObject tradeParamsJSON = liveItem.extendVal.getTradeParamsJSON();
        try {
            tradeParamsJSON = JSON.parseObject(liveItem.extendVal.tradeParams);
            if (map != null) {
                map.put("tradeParams", JSON.toJSONString(tradeParamsJSON));
            }
            l(up6.c0(ux9Var), tradeParamsJSON, liveItem);
            if (map != null) {
                map.put("useSignTradeParams", JSON.toJSONString(tradeParamsJSON));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return tradeParamsJSON;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(54:41|(5:43|(1:45)(1:46)|47|(1:49)(1:51)|50)(1:52)|53|(2:55|(50:69|72|(1:74)|75|253|76|(1:78)|84|(3:86|(3:89|90|87)|271)|91|247|92|(6:269|94|249|95|(3:97|(6:100|101|255|102|103|98)|272)|109)(1:112)|243|113|114|263|115|(1:117)|120|(1:122)(1:123)|124|(1:126)|127|(8:129|130|267|131|132|261|133|(1:135))(1:138)|139|144|(2:148|(2:152|(1:154)(1:155)))|156|(1:158)(1:159)|(4:161|(1:163)|164|(1:166)(1:167))|245|168|(3:170|251|171)(1:174)|(1:176)|177|(1:179)|180|(1:182)|183|(2:185|(1:187))|188|(1:190)(1:191)|192|193|(4:195|259|196|(1:206))|209|(3:211|257|212)(1:215)|216|220))(1:70)|71|72|(0)|75|253|76|(0)|84|(0)|91|247|92|(0)(0)|243|113|114|263|115|(0)|120|(0)(0)|124|(0)|127|(0)(0)|139|144|(3:146|148|(3:150|152|(0)(0)))|156|(0)(0)|(0)|245|168|(0)(0)|(0)|177|(0)|180|(0)|183|(0)|188|(0)(0)|192|193|(0)|209|(0)(0)|216|220) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0355, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0421, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0424, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0425, code lost:
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x064f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0650, code lost:
        r5 = r28;
        r2 = r32;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x025c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025d, code lost:
        r23 = r14;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0261, code lost:
        r24 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0332 A[Catch: JSONException -> 0x0355, TryCatch #10 {JSONException -> 0x0355, blocks: (B:115:0x030d, B:117:0x0332, B:120:0x0358, B:122:0x0390, B:124:0x0397, B:126:0x03a1, B:127:0x03ab, B:129:0x03b1), top: B:263:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0390 A[Catch: JSONException -> 0x0355, TryCatch #10 {JSONException -> 0x0355, blocks: (B:115:0x030d, B:117:0x0332, B:120:0x0358, B:122:0x0390, B:124:0x0397, B:126:0x03a1, B:127:0x03ab, B:129:0x03b1), top: B:263:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a1 A[Catch: JSONException -> 0x0355, TryCatch #10 {JSONException -> 0x0355, blocks: (B:115:0x030d, B:117:0x0332, B:120:0x0358, B:122:0x0390, B:124:0x0397, B:126:0x03a1, B:127:0x03ab, B:129:0x03b1), top: B:263:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b1 A[Catch: JSONException -> 0x0355, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0355, blocks: (B:115:0x030d, B:117:0x0332, B:120:0x0358, B:122:0x0390, B:124:0x0397, B:126:0x03a1, B:127:0x03ab, B:129:0x03b1), top: B:263:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0563 A[Catch: Exception -> 0x0558, TryCatch #4 {Exception -> 0x0558, blocks: (B:171:0x0554, B:176:0x0563, B:177:0x056f, B:179:0x057d, B:180:0x058b, B:182:0x0591, B:183:0x059f, B:185:0x05ae, B:187:0x05d0, B:188:0x05dd, B:192:0x05ec), top: B:251:0x0554 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x057d A[Catch: Exception -> 0x0558, TryCatch #4 {Exception -> 0x0558, blocks: (B:171:0x0554, B:176:0x0563, B:177:0x056f, B:179:0x057d, B:180:0x058b, B:182:0x0591, B:183:0x059f, B:185:0x05ae, B:187:0x05d0, B:188:0x05dd, B:192:0x05ec), top: B:251:0x0554 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0591 A[Catch: Exception -> 0x0558, TryCatch #4 {Exception -> 0x0558, blocks: (B:171:0x0554, B:176:0x0563, B:177:0x056f, B:179:0x057d, B:180:0x058b, B:182:0x0591, B:183:0x059f, B:185:0x05ae, B:187:0x05d0, B:188:0x05dd, B:192:0x05ec), top: B:251:0x0554 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05ae A[Catch: Exception -> 0x0558, TryCatch #4 {Exception -> 0x0558, blocks: (B:171:0x0554, B:176:0x0563, B:177:0x056f, B:179:0x057d, B:180:0x058b, B:182:0x0591, B:183:0x059f, B:185:0x05ae, B:187:0x05d0, B:188:0x05dd, B:192:0x05ec), top: B:251:0x0554 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253 A[Catch: JSONException -> 0x025c, TryCatch #5 {JSONException -> 0x025c, blocks: (B:76:0x0248, B:78:0x0253, B:84:0x0269, B:86:0x0273, B:87:0x027b, B:89:0x0281), top: B:253:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0273 A[Catch: JSONException -> 0x025c, TryCatch #5 {JSONException -> 0x025c, blocks: (B:76:0x0248, B:78:0x0253, B:84:0x0269, B:86:0x0273, B:87:0x027b, B:89:0x0281), top: B:253:0x0248 }] */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.Map] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(tb.ux9 r28, android.app.Activity r29, com.taobao.taolive.sdk.model.common.LiveItem r30, int r31, java.util.HashMap<java.lang.String, java.lang.String> r32) {
        /*
            Method dump skipped, instructions count: 1751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.adapterimpl.nav.TaoLiveActionUtils.D(tb.ux9, android.app.Activity, com.taobao.taolive.sdk.model.common.LiveItem, int, java.util.HashMap):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(60:48|(5:50|(1:52)(1:53)|54|(1:56)(1:58)|57)(1:59)|60|(2:62|(55:76|79|(1:81)|82|262|83|84|266|85|(1:87)|93|(3:95|(3:98|99|96)|280)|100|272|101|(5:103|268|104|(3:106|(3:109|110|107)|281)|113)|116|117|276|118|119|256|120|(2:260|122)|125|(1:127)(1:128)|129|(1:131)|132|(8:134|135|274|136|137|264|138|(1:140))(1:146)|147|152|(1:156)|157|(1:159)|160|(1:166)(1:165)|167|(1:169)(1:170)|(4:172|(1:174)|175|(1:177)(1:178))|258|179|(1:181)|184|(1:186)|187|(1:189)|190|(2:192|(1:194))|195|(1:197)(1:198)|199|(4:201|(1:211)|212|(1:222))|223|225))(1:77)|78|79|(0)|82|262|83|84|266|85|(0)|93|(0)|100|272|101|(0)|116|117|276|118|119|256|120|(0)|125|(0)(0)|129|(0)|132|(0)(0)|147|152|(2:154|156)|157|(0)|160|(0)|166|167|(0)(0)|(0)|258|179|(0)|184|(0)|187|(0)|190|(0)|195|(0)(0)|199|(0)|223|225) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x030b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030c, code lost:
        r29 = r29;
        r9 = "";
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0441, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0442, code lost:
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x044c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x044d, code lost:
        r29 = r29;
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0453, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x058f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0693, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0279, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027a, code lost:
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x027c, code lost:
        r9 = "";
        r5 = r14;
        r8 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0282, code lost:
        r24 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c4 A[Catch: JSONException -> 0x030b, TRY_LEAVE, TryCatch #8 {JSONException -> 0x030b, blocks: (B:101:0x02ba, B:103:0x02c4, B:116:0x0314), top: B:272:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b4 A[Catch: JSONException -> 0x0373, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0373, blocks: (B:122:0x0350, B:127:0x03b4, B:131:0x03c5), top: B:260:0x0350 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c5 A[Catch: JSONException -> 0x0373, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0373, blocks: (B:122:0x0350, B:127:0x03b4, B:131:0x03c5), top: B:260:0x0350 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d5 A[Catch: JSONException -> 0x0441, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0441, blocks: (B:120:0x032b, B:125:0x037c, B:129:0x03bb, B:132:0x03cf, B:134:0x03d5), top: B:256:0x032b }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0582 A[Catch: Exception -> 0x058f, TryCatch #1 {Exception -> 0x058f, blocks: (B:179:0x057d, B:181:0x0582, B:184:0x0592, B:186:0x05a0, B:187:0x05ae, B:189:0x05b4, B:190:0x05c0, B:192:0x05d0, B:194:0x05f2, B:195:0x05ff, B:199:0x060e, B:201:0x0615, B:203:0x061d, B:205:0x0623, B:207:0x062f, B:209:0x0637, B:211:0x063d, B:212:0x0640, B:214:0x0648, B:216:0x064e, B:218:0x065a, B:220:0x0662, B:222:0x0668, B:223:0x066b), top: B:258:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a0 A[Catch: Exception -> 0x058f, TryCatch #1 {Exception -> 0x058f, blocks: (B:179:0x057d, B:181:0x0582, B:184:0x0592, B:186:0x05a0, B:187:0x05ae, B:189:0x05b4, B:190:0x05c0, B:192:0x05d0, B:194:0x05f2, B:195:0x05ff, B:199:0x060e, B:201:0x0615, B:203:0x061d, B:205:0x0623, B:207:0x062f, B:209:0x0637, B:211:0x063d, B:212:0x0640, B:214:0x0648, B:216:0x064e, B:218:0x065a, B:220:0x0662, B:222:0x0668, B:223:0x066b), top: B:258:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b4 A[Catch: Exception -> 0x058f, TryCatch #1 {Exception -> 0x058f, blocks: (B:179:0x057d, B:181:0x0582, B:184:0x0592, B:186:0x05a0, B:187:0x05ae, B:189:0x05b4, B:190:0x05c0, B:192:0x05d0, B:194:0x05f2, B:195:0x05ff, B:199:0x060e, B:201:0x0615, B:203:0x061d, B:205:0x0623, B:207:0x062f, B:209:0x0637, B:211:0x063d, B:212:0x0640, B:214:0x0648, B:216:0x064e, B:218:0x065a, B:220:0x0662, B:222:0x0668, B:223:0x066b), top: B:258:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05d0 A[Catch: Exception -> 0x058f, TryCatch #1 {Exception -> 0x058f, blocks: (B:179:0x057d, B:181:0x0582, B:184:0x0592, B:186:0x05a0, B:187:0x05ae, B:189:0x05b4, B:190:0x05c0, B:192:0x05d0, B:194:0x05f2, B:195:0x05ff, B:199:0x060e, B:201:0x0615, B:203:0x061d, B:205:0x0623, B:207:0x062f, B:209:0x0637, B:211:0x063d, B:212:0x0640, B:214:0x0648, B:216:0x064e, B:218:0x065a, B:220:0x0662, B:222:0x0668, B:223:0x066b), top: B:258:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0615 A[Catch: Exception -> 0x058f, TryCatch #1 {Exception -> 0x058f, blocks: (B:179:0x057d, B:181:0x0582, B:184:0x0592, B:186:0x05a0, B:187:0x05ae, B:189:0x05b4, B:190:0x05c0, B:192:0x05d0, B:194:0x05f2, B:195:0x05ff, B:199:0x060e, B:201:0x0615, B:203:0x061d, B:205:0x0623, B:207:0x062f, B:209:0x0637, B:211:0x063d, B:212:0x0640, B:214:0x0648, B:216:0x064e, B:218:0x065a, B:220:0x0662, B:222:0x0668, B:223:0x066b), top: B:258:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0350 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0270 A[Catch: JSONException -> 0x0279, TryCatch #5 {JSONException -> 0x0279, blocks: (B:85:0x026a, B:87:0x0270, B:93:0x0288, B:95:0x0292, B:96:0x029a, B:98:0x02a0), top: B:266:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0292 A[Catch: JSONException -> 0x0279, TryCatch #5 {JSONException -> 0x0279, blocks: (B:85:0x026a, B:87:0x0270, B:93:0x0288, B:95:0x0292, B:96:0x029a, B:98:0x02a0), top: B:266:0x026a }] */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.Map] */
    /* JADX WARN: Unknown variable types count: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(tb.ux9 r33, android.app.Activity r34, com.taobao.taolive.sdk.model.common.LiveItem r35, java.lang.String r36, java.util.HashMap<java.lang.String, java.lang.String> r37) {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.adapterimpl.nav.TaoLiveActionUtils.E(tb.ux9, android.app.Activity, com.taobao.taolive.sdk.model.common.LiveItem, java.lang.String, java.util.HashMap):void");
    }

    @Override // tb.geb
    public void a(ux9 ux9Var, Activity activity, LiveItem liveItem, int i, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91232728", new Object[]{this, ux9Var, activity, liveItem, new Integer(i), hashMap});
        } else {
            D(ux9Var, activity, liveItem, i, hashMap);
        }
    }

    @Override // tb.geb
    public void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a32c92", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    @Override // tb.geb
    public void c(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a83b1a0", new Object[]{this, ux9Var, activity, liveItem, str, hashMap});
        } else {
            E(ux9Var, activity, liveItem, str, hashMap);
        }
    }

    public final void e(ux9 ux9Var, LiveItem liveItem, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f45e8d", new Object[]{this, ux9Var, liveItem, contentBusinessModel});
        } else if (contentBusinessModel != null && contentBusinessModel.dataAttributes != null && ux9Var != null && ux9Var.j() != null && ux9Var.j().o("showHotAtmosphere", Boolean.class) != null) {
            try {
                if (((Boolean) ux9Var.j().o("showHotAtmosphere", Boolean.class)).booleanValue() && liveItem != null) {
                    if ("card_itm".equals(liveItem.cpsClickPos) || "card_buy".equals(liveItem.cpsClickPos)) {
                        contentBusinessModel.dataAttributes.put("item_atmospheretype", "1");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void f(ContentBusinessModel contentBusinessModel, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8c4ef4", new Object[]{this, contentBusinessModel, jSONObject, map});
            return;
        }
        if (vx9.d() != null && !TextUtils.isEmpty(jSONObject.getString("liveId")) && vx9.a(jSONObject.getString("liveId"))) {
            map.put("liveToken", vx9.d().p());
        }
        String str = contentBusinessModel.sourceType;
        if (str != null) {
            map.put("sourceType", str);
        }
    }

    public final void g(ux9 ux9Var, JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea62d57", new Object[]{this, ux9Var, jSONObject, jSONObject2});
            return;
        }
        try {
            if (yqq.h(v2s.o().p().b("tblive", "enableAddLiveTokenTcp", "true")) && ux9Var != null && jSONObject != null && jSONObject2 != null && !TextUtils.isEmpty(jSONObject.getString("liveId")) && jSONObject.getString("liveId").equals(ux9Var.i)) {
                jSONObject2.put("liveToken", ux9Var.p());
            }
        } catch (Exception unused) {
        }
    }

    public final void h(VideoInfo videoInfo, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f0444e", new Object[]{this, videoInfo, contentBusinessModel});
        } else if (contentBusinessModel != null && videoInfo != null && videoInfo.isOfficialType() && sbt.o()) {
            contentBusinessModel.trackSource = "tblivegft";
            contentBusinessModel.trackSubSource = "tblivegft";
            if (contentBusinessModel.context == null) {
                contentBusinessModel.context = new org.json.JSONObject();
            }
            try {
                contentBusinessModel.context.put("officialLiveId", videoInfo.officialLiveInfo.officialLiveId);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public final void j(LiveItem liveItem, ContentBusinessModel contentBusinessModel, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363abe12", new Object[]{this, liveItem, contentBusinessModel, map});
        } else if (liveItem != null && contentBusinessModel != null) {
            if (!TextUtils.isEmpty(liveItem.cpsClickPos)) {
                try {
                    if (contentBusinessModel.context == null) {
                        contentBusinessModel.context = new org.json.JSONObject();
                    }
                    contentBusinessModel.context.putOpt("clickPos", liveItem.cpsClickPos);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else if (!TextUtils.isEmpty(map.get("highlight_card_clickPos")) && sbt.j()) {
                try {
                    if (contentBusinessModel.context == null) {
                        contentBusinessModel.context = new org.json.JSONObject();
                    }
                    contentBusinessModel.context.putOpt("clickPos", map.get("highlight_card_clickPos"));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            VideoInfo c0 = up6.c0(vx9.d());
            if (c0 != null) {
                if (zga.e(c0.itemTransferInfo)) {
                    if (qfa.f(liveItem)) {
                        str = "pcg_recommand";
                    } else {
                        str = "pcg_self";
                    }
                    contentBusinessModel.actionSource = str;
                }
                if (map != null) {
                    map.put("actionSource", contentBusinessModel.actionSource);
                }
            }
        }
    }

    public String k(VideoInfo videoInfo, String str, LiveItem liveItem) {
        String sb;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5dd5ae5", new Object[]{this, videoInfo, str, liveItem});
        }
        if (!this.d) {
            v7t.d("TaoLiveActionUtils", "mEnableModifyNewtonsParams  is false.");
            return str;
        } else if (TextUtils.isEmpty(str) || liveItem == null) {
            return str;
        } else {
            String a2 = xts.a(str);
            if (TextUtils.isEmpty(a2)) {
                xts.d(str, "detail", liveItem);
                v7t.d("TaoLiveActionUtils", "appendSignNewtonParams url newtonParams is null.");
                return str;
            }
            String str3 = "?newtonParams=" + a2;
            String decode = Uri.decode(a2);
            StringBuilder sb2 = new StringBuilder(u(decode, liveItem));
            m(videoInfo, sb2);
            if (TextUtils.equals(decode, sb2.toString())) {
                v7t.d("TaoLiveActionUtils", "uSignNewtonParamsStr  is unchanging.");
                return str;
            }
            if (str.contains(str3)) {
                str2 = "?";
            } else {
                str2 = "&";
            }
            return xts.c(str, "newtonParams", str2 + "newtonParams=" + Uri.encode(sb));
        }
    }

    public final void l(VideoInfo videoInfo, JSONObject jSONObject, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ef7d95", new Object[]{this, videoInfo, jSONObject, liveItem});
        } else if (jSONObject == null || !this.d) {
            v7t.d("TaoLiveActionUtils", "mEnableModifyNewtonsParams  is false.");
        } else {
            String string = jSONObject.getString("newtonParams");
            if (TextUtils.isEmpty(string)) {
                xts.d("", to8.ADD_CART, liveItem);
                v7t.d("TaoLiveActionUtils", "appendSignNewtonParams tradeParams newtonParams is null.");
                return;
            }
            StringBuilder sb = new StringBuilder(u(string, liveItem));
            m(videoInfo, sb);
            jSONObject.remove("newtonParams");
            jSONObject.put("newtonParams", (Object) sb.toString());
        }
    }

    public final void m(VideoInfo videoInfo, StringBuilder sb) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e685a8", new Object[]{this, videoInfo, sb});
        } else if (videoInfo != null && (hashMap = videoInfo.newtonParamsMap) != null && hashMap.keySet().size() > 0 && this.c && sb != null) {
            for (String str : videoInfo.newtonParamsMap.keySet()) {
                String str2 = "@@" + str + "@";
                String str3 = str + "@";
                String sb2 = sb.toString();
                if (!sb2.contains(str2) && !sb2.startsWith(str3)) {
                    String str4 = videoInfo.newtonParamsMap.get(str);
                    if (!TextUtils.isEmpty(str4)) {
                        sb.append(str2);
                        sb.append(str4);
                    }
                }
            }
        }
    }

    public final String r(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28ce3f60", new Object[]{this, liveItem});
        }
        JSONObject jSONObject = liveItem.itemConfigInfo;
        if (jSONObject == null || !jSONObject.containsKey("itemSourceType")) {
            return "live";
        }
        return liveItem.itemConfigInfo.getString("itemSourceType");
    }

    public final void v(ux9 ux9Var, LiveItem liveItem, ContentBusinessModel contentBusinessModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c245e9ee", new Object[]{this, ux9Var, liveItem, contentBusinessModel, str});
            return;
        }
        i(ux9Var, contentBusinessModel, liveItem);
        contentBusinessModel.dataAttributes = BusinessUtil.e(ux9Var, contentBusinessModel.dataAttributes, str);
        e(ux9Var, liveItem, contentBusinessModel);
    }

    public final void w(JSONObject jSONObject, ContentBusinessModel contentBusinessModel, VideoInfo videoInfo) throws JSONException {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801cf417", new Object[]{this, jSONObject, contentBusinessModel, videoInfo});
        } else if (videoInfo != null && (jSONObject2 = videoInfo.tcpContext) != null && jSONObject2.size() > 0 && !TextUtils.isEmpty(jSONObject.getString("liveId")) && jSONObject.getString("liveId").equals(videoInfo.liveId)) {
            for (String str : videoInfo.tcpContext.keySet()) {
                String valueOf = String.valueOf(str);
                contentBusinessModel.context.put(valueOf, videoInfo.tcpContext.get(valueOf));
            }
        }
    }

    public final void y(ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650e572e", new Object[]{this, contentBusinessModel});
        } else if (contentBusinessModel != null) {
            sjr.g().e("com.taobao.taolive.room.good_click", new String[]{contentBusinessModel.contentId, contentBusinessModel.itemId});
        }
    }

    public final void C(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b9b874", new Object[]{this, ux9Var, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = uyv.HTTPS_SCHEMA.concat(str);
            }
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(bia.UNDER_TAKE_INSIDE_DETAIL);
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = String.valueOf(false);
                }
                if (ux9Var != null) {
                    ux9Var.a0(queryParameter);
                }
                v7t.d("TaoLiveActionUtils", "跳转商详 insideDetailStr:" + queryParameter);
            }
        }
    }

    public final String u(String str, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3bf0aff", new Object[]{this, str, liveItem});
        }
        if (!this.b || str.contains("@@uSig@") || str.startsWith("uSig@")) {
            return str;
        }
        this.e = true;
        String b = xts.b(Login.getUserId() + "_" + liveItem.liveId + "_" + liveItem.itemId + "_" + this.f12994a);
        return str + "@@uSig@" + b;
    }

    public final void i(ux9 ux9Var, ContentBusinessModel contentBusinessModel, LiveItem liveItem) {
        JSONObject jSONObject;
        JSONObject d;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969840c7", new Object[]{this, ux9Var, contentBusinessModel, liveItem});
        } else if (contentBusinessModel != null && liveItem != null) {
            if (contentBusinessModel.dataAttributes == null) {
                contentBusinessModel.dataAttributes = new org.json.JSONObject();
            }
            try {
                String str2 = "1";
                if (liveItem.itemExtData != null) {
                    List asList = Arrays.asList(sbt.x().split(","));
                    JSONObject jSONObject2 = liveItem.itemExtData.getJSONObject("itemListTrackData");
                    if (jSONObject2 != null) {
                        for (String str3 : jSONObject2.keySet()) {
                            if (asList.contains(str3)) {
                                if (TextUtils.equals(str3, "isStressShow") && ux9Var != null) {
                                    if (ux9Var.Q) {
                                        str = "N";
                                    } else {
                                        str = "Y";
                                    }
                                    jSONObject2.put(str3, (Object) str);
                                }
                                contentBusinessModel.dataAttributes.put(str3, jSONObject2.get(str3));
                            }
                        }
                        JSONArray jSONArray = jSONObject2.getJSONArray("liveItemTags");
                        if (jSONArray != null && !jSONArray.isEmpty()) {
                            for (int i = 0; i < jSONArray.size(); i++) {
                                if (asList.contains(jSONArray.getString(i))) {
                                    contentBusinessModel.dataAttributes.put(jSONArray.getString(i), str2);
                                }
                            }
                        }
                    }
                    if (liveItem.itemExtData.getJSONObject("giftActivityInfo") != null) {
                        contentBusinessModel.dataAttributes.put("is_bogo", str2);
                    }
                }
                LiveItem.Ext ext = liveItem.extendVal;
                if (!(ext == null || TextUtils.isEmpty(ext.secKillInfo) || (d = fkx.d(liveItem.extendVal.secKillInfo)) == null)) {
                    contentBusinessModel.dataAttributes.put("activityType", d.getString("activityType"));
                }
                JSONObject jSONObject3 = liveItem.liveItemStatusData;
                if (jSONObject3 != null) {
                    org.json.JSONObject jSONObject4 = contentBusinessModel.dataAttributes;
                    if (!jSONObject3.getBooleanValue("isSpeaking")) {
                        str2 = "0";
                    }
                    jSONObject4.put("if_explaining", str2);
                }
                JSONObject jSONObject5 = liveItem.nativeConfigInfos;
                if (jSONObject5 != null) {
                    contentBusinessModel.dataAttributes.put("entry_clkPos", jSONObject5.getString("entry_clkPos"));
                }
                JSONArray jSONArray2 = liveItem.picTopLabels;
                if (!(jSONArray2 == null || jSONArray2.size() <= 0 || (jSONObject = liveItem.picTopLabels.getJSONObject(0)) == null)) {
                    contentBusinessModel.dataAttributes.put("picTopLabel", jSONObject.getString("labelType"));
                }
                JSONObject jSONObject6 = liveItem.nativeConfigInfos;
                if (!(jSONObject6 == null || jSONObject6.getJSONObject("remoteTcpParams") == null)) {
                    for (Map.Entry<String, Object> entry : liveItem.nativeConfigInfos.getJSONObject("remoteTcpParams").entrySet()) {
                        contentBusinessModel.dataAttributes.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (JSONException e) {
                v2s.o().A().c("addSabAtmosphereParamsToDataAttributes", e.getMessage());
            }
        }
    }

    public final boolean n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c8aa6f0", new Object[]{this, context, str})).booleanValue();
        }
        if ("true".equals(str)) {
            return true;
        }
        if (!(context instanceof tsd) || !(context instanceof fee)) {
            return false;
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableInsideDetailAnyway", "true"));
    }

    public final String t(String str) {
        URI create;
        String query;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb5b16f9", new Object[]{this, str});
        }
        try {
            create = URI.create(str);
        } catch (Exception unused) {
        }
        if (create == null || (query = create.getQuery()) == null) {
            return null;
        }
        String[] split2 = query.split("&");
        for (int i = 0; i < split2.length; i++) {
            if (split2[i].startsWith(z9u.ARG_PG1_STEKC)) {
                String str2 = split2[i];
                if (TextUtils.isEmpty(str2) || (split = str2.split("=")) == null || split.length != 2) {
                    return null;
                }
                return split[1];
            }
        }
        return null;
    }

    public String z(Context context, String str, LiveItem liveItem) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31b62ac8", new Object[]{this, context, str, liveItem});
        }
        JSONObject jSONObject = liveItem.itemExtData;
        if (jSONObject != null && (jSONObject.get("enableDrawer") instanceof String)) {
            try {
                if (!Boolean.parseBoolean(jSONObject.getString("enableDrawer"))) {
                    return str;
                }
            } catch (Throwable th) {
                v7t.d("GoodListEnableInside", th.toString());
            }
        }
        if (TextUtils.isEmpty(str) || liveItem.itemConfigInfo == null) {
            return str;
        }
        String r = r(liveItem);
        if (!sbt.k()) {
            return str;
        }
        kzb h = v2s.o().h();
        if (h != null && h.getDeviceLevel() == 2 && sbt.y()) {
            qbf.a("Button-Inside_Fail", r, "1001", str);
            return str;
        } else if (vc.i(context) || vc.d(context)) {
            o3s.d("TaoLiveActionUtils", "replaceInsideDetailUrl | pad or fold device.");
            return str;
        } else if (!"hold".equalsIgnoreCase(liveItem.itemConfigInfo.getString("itemSourceType")) && !sbt.l()) {
            return str;
        } else {
            if (!n(context, liveItem.itemConfigInfo.getString(bia.UNDER_TAKE_INSIDE_DETAIL))) {
                qbf.a("Button-Inside_Fail", r, "1003", str);
                return str + "&insideDetail=false";
            }
            for (String str2 : sbt.w().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (str.contains(str2)) {
                    String valueOf = String.valueOf(liveItem.itemId);
                    if (xbf.e(valueOf)) {
                        qbf.b(valueOf, r);
                    }
                    qbf.a("Button-Inside_Suc", r, "", str);
                    return str.replace(str2, "h5.m.taobao.com/awp/core/detail/inside.htm") + "&insideDetail=true&from=" + r + "&insideDetailType=" + r + "&stdPopId=" + String.valueOf(context.hashCode());
                }
            }
            qbf.a("Button-Inside_Fail", r, "1004", str);
            return str;
        }
    }
}
