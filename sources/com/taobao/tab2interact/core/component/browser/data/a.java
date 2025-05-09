package com.taobao.tab2interact.core.component.browser.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import tb.a2n;
import tb.j0r;
import tb.nwv;
import tb.rwl;
import tb.t2o;
import tb.vff;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OPTBALANCES = "optBalances";

    static {
        t2o.a(689963053);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserBadgeViewModel d(com.alibaba.fastjson.JSONObject r8, com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.a r9, com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.UserType r10, com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.UserStage r11) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.data.a.d(com.alibaba.fastjson.JSONObject, com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$a, com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$UserType, com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$UserStage):com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserBadgeViewModel");
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.d f(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.d) ipChange.ipc$dispatch("3d3401ae", new Object[]{jSONObject, dVar});
        }
        if (dVar == null) {
            dVar = new BrowserBadgeModel.BrowserBadgeViewModel.d();
        }
        if (jSONObject != null) {
            dVar.f11800a = jSONObject.getString("paddingColor");
            dVar.b = nwv.y(jSONObject.getString("totalProgressDuration"), 0L);
        }
        return dVar;
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.e g(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.e) ipChange.ipc$dispatch("c1d86173", new Object[]{jSONObject, eVar});
        }
        if (eVar == null) {
            eVar = new BrowserBadgeModel.BrowserBadgeViewModel.e();
        }
        if (jSONObject != null) {
            eVar.f11801a = nwv.y(jSONObject.getString("remainingDuration"), 0L);
            eVar.b = jSONObject.getString("color");
            if (TextUtils.equals("FETCH_VIEW", jSONObject.getString(rwl.KEY_DIMENSION))) {
                eVar.c = BrowserBadgeModel.TaskType.BROWSE_IN_TASK_PANEL;
            }
        }
        return eVar;
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.f h(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.f) ipChange.ipc$dispatch("afbb3311", new Object[]{jSONObject, fVar});
        }
        if (fVar == null) {
            fVar = new BrowserBadgeModel.BrowserBadgeViewModel.f();
        }
        if (jSONObject != null) {
            g(jSONObject, fVar);
            fVar.d = jSONObject.getString("triggerType");
        }
        return fVar;
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.PicModel i(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) ipChange.ipc$dispatch("79db211a", new Object[]{jSONObject, picModel});
        }
        if (picModel == null) {
            picModel = new BrowserBadgeModel.BrowserBadgeViewModel.PicModel();
        }
        if (jSONObject != null) {
            picModel.f11797a = j(jSONObject.getString("type"), jSONObject.getString("url"));
            picModel.b = jSONObject.getString("url");
            picModel.c = jSONObject.getString("width");
            picModel.d = jSONObject.getString("height");
        }
        return picModel;
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.i k(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.i) ipChange.ipc$dispatch("c85907cb", new Object[]{jSONObject, iVar});
        }
        if (iVar == null) {
            iVar = new BrowserBadgeModel.BrowserBadgeViewModel.i();
        }
        if (jSONObject != null) {
            iVar.f11804a = jSONObject.getString("text");
            iVar.b = jSONObject.getString("textColor");
        }
        return iVar;
    }

    public static BrowserBadgeModel.UserStage m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.UserStage) ipChange.ipc$dispatch("317c86f", new Object[]{str});
        }
        if (TextUtils.equals("fresh", str)) {
            return BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER;
        }
        return null;
    }

    public static BrowserBadgeModel.UserType n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.UserType) ipChange.ipc$dispatch("6dd25c01", new Object[]{str});
        }
        if (TextUtils.equals("true", str)) {
            return BrowserBadgeModel.UserType.REWARD_ENHANCED;
        }
        return null;
    }

    public static void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97ad767", new Object[]{jSONObject});
            return;
        }
        if (jSONObject.get(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM);
            if (jSONObject2.getJSONObject("textPic") == null) {
                String string = jSONObject2.getString("text");
                JSONObject f = j0r.f();
                if (!(f == null || f.get(string) == null)) {
                    JSONObject jSONObject3 = f.getJSONObject(string);
                    vgh.c(null, "BrowserBadgeResponseDataProcessor", "预处理entrance，将底部区域文本转换为图片，pic=" + jSONObject3.toJSONString());
                    jSONObject2.put("pic", (Object) jSONObject3);
                }
            }
        }
        if (jSONObject.get("paddingComponent") != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("paddingComponent");
            long y = nwv.y(jSONObject4.getString("taskInitTime"), 0L);
            long y2 = nwv.y(jSONObject4.getString("duration"), 0L);
            long currentTimeMillis = System.currentTimeMillis();
            vgh.c(null, "BrowserBadgeResponseDataProcessor", "预处理entrance，判断新人引导气泡的展示时间是否小于当前时间，taskInitTime=" + y + "，duration=" + y2 + "，currentTime=" + currentTimeMillis);
            if (y + (y2 * 1000) < currentTimeMillis) {
                vgh.c(null, "BrowserBadgeResponseDataProcessor", "预处理entrance，判断新人引导气泡的展示时间小于当前时间");
                jSONObject.remove("paddingComponent");
            }
        }
    }

    public static void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535e19b2", new Object[]{jSONObject});
        } else if (jSONObject != null && j0r.d() && jSONObject.get("entranceList") != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("entranceList");
            if (!jSONArray.isEmpty() && jSONArray.get(0) != null) {
                o(jSONArray.getJSONObject(0));
            }
        }
    }

    public static void q(BrowserBadgeModel browserBadgeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b380f8b2", new Object[]{browserBadgeModel});
        } else if (browserBadgeModel != null) {
            if (browserBadgeModel.f11795a == null) {
                browserBadgeModel.f11795a = BrowserBadgeModel.UserType.DEFAULT;
            }
            if (browserBadgeModel.b == null) {
                browserBadgeModel.b = BrowserBadgeModel.UserStage.DEFAULT;
            }
            BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = browserBadgeModel.f;
            if (browserBadgeViewModel != null) {
                BrowserBadgeModel.BrowserBadgeViewModel.j jVar = browserBadgeViewModel.f11796a;
                if (jVar != null) {
                    BrowserBadgeModel.BrowserBadgeViewModel.i iVar = jVar.f11805a;
                    if (iVar != null && !TextUtils.isEmpty(iVar.f11804a) && TextUtils.isEmpty(iVar.b)) {
                        iVar.b = "#f9b20a";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel = jVar.b;
                    if (picModel != null && !TextUtils.isEmpty(picModel.b)) {
                        if (picModel.f11797a == null) {
                            picModel.f11797a = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel.c)) {
                            picModel.c = a2n.ARCH_BIT32;
                        }
                        if (TextUtils.isEmpty(picModel.d)) {
                            picModel.d = a2n.ARCH_BIT32;
                        }
                    }
                }
                BrowserBadgeModel.BrowserBadgeViewModel.c cVar = browserBadgeViewModel.c;
                if (cVar != null) {
                    BrowserBadgeModel.BrowserBadgeViewModel.i iVar2 = cVar.f11799a;
                    if (iVar2 != null && !TextUtils.isEmpty(iVar2.f11804a) && TextUtils.isEmpty(iVar2.b)) {
                        iVar2.b = "#f9ef9f";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel2 = cVar.b;
                    if (picModel2 != null && !TextUtils.isEmpty(picModel2.b)) {
                        if (picModel2.f11797a == null) {
                            picModel2.f11797a = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel2.c)) {
                            picModel2.c = "9";
                        }
                        if (TextUtils.isEmpty(picModel2.d)) {
                            picModel2.d = "14";
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel3 = cVar.c;
                    if (picModel3 != null && !TextUtils.isEmpty(picModel3.b)) {
                        if (picModel3.f11797a == null) {
                            picModel3.f11797a = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel3.c)) {
                            picModel3.c = "85";
                        }
                        if (TextUtils.isEmpty(picModel3.d)) {
                            picModel3.d = "34";
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel4 = cVar.d;
                    if (picModel4 != null && !TextUtils.isEmpty(picModel4.b)) {
                        if (picModel4.f11797a == null) {
                            picModel4.f11797a = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel4.c)) {
                            picModel4.c = "86";
                        }
                        if (TextUtils.isEmpty(picModel4.d)) {
                            picModel4.d = "34";
                        }
                    }
                }
                BrowserBadgeModel.BrowserBadgeViewModel.h hVar = browserBadgeViewModel.b;
                if (hVar != null) {
                    BrowserBadgeModel.BrowserBadgeViewModel.i iVar3 = hVar.f11803a;
                    if (iVar3 != null && !TextUtils.isEmpty(iVar3.f11804a) && TextUtils.isEmpty(iVar3.b)) {
                        iVar3.b = "#ff0000";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.i iVar4 = hVar.b;
                    if (iVar4 != null && !TextUtils.isEmpty(iVar4.f11804a) && TextUtils.isEmpty(iVar4.b)) {
                        iVar4.b = "#ff0000";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.i iVar5 = hVar.c;
                    if (iVar5 != null && !TextUtils.isEmpty(iVar5.f11804a) && TextUtils.isEmpty(iVar5.b)) {
                        iVar5.b = "#FFD666";
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.f fVar = hVar.d;
                    if (fVar != null) {
                        if (TextUtils.isEmpty(fVar.b)) {
                            fVar.b = "#FFD666";
                        }
                        if (fVar.c == null) {
                            fVar.c = BrowserBadgeModel.TaskType.DEFAULT;
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel5 = hVar.e;
                    if (picModel5 != null && !TextUtils.isEmpty(picModel5.b)) {
                        if (picModel5.f11797a == null) {
                            picModel5.f11797a = BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG;
                        }
                        if (TextUtils.isEmpty(picModel5.c)) {
                            picModel5.c = "90";
                        }
                        if (TextUtils.isEmpty(picModel5.d)) {
                            picModel5.d = "90";
                        }
                    }
                    BrowserBadgeModel.BrowserBadgeViewModel.d dVar = hVar.g;
                    if (dVar == null) {
                        dVar = new BrowserBadgeModel.BrowserBadgeViewModel.d();
                    }
                    if (TextUtils.isEmpty(dVar.f11800a)) {
                        dVar.f11800a = "#ffb600";
                    }
                }
            }
            BrowserBadgeModel.BrowserTaskModel browserTaskModel = browserBadgeModel.e;
            if (browserTaskModel != null && browserTaskModel.c <= 0) {
                browserTaskModel.c = 5000L;
            }
        }
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.a b(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.a) ipChange.ipc$dispatch("d8961678", new Object[]{jSONObject, aVar});
        }
        if (aVar == null) {
            aVar = new BrowserBadgeModel.BrowserBadgeViewModel.a();
        }
        if (jSONObject != null) {
            aVar.f11798a = nwv.t(jSONObject.getString("startAmount"), 0);
            aVar.b = nwv.t(jSONObject.getString("endAmount"), 0);
            aVar.c = nwv.y(jSONObject.getString("millisecPerCent"), 0L);
            aVar.d = jSONObject.getString("rmbSymbol");
        }
        return aVar;
    }

    public static BrowserBadgeModel.BrowserBadgeViewModel.b c(JSONObject jSONObject, BrowserBadgeModel.BrowserBadgeViewModel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.b) ipChange.ipc$dispatch("d33db528", new Object[]{jSONObject, bVar});
        }
        if (bVar == null) {
            bVar = new BrowserBadgeModel.BrowserBadgeViewModel.b();
        }
        if (jSONObject != null && TextUtils.equals("ACCOUNT_AMOUNT_MULTIPLE", jSONObject.getString("triggerType"))) {
            if (jSONObject.get("pic") != null) {
                i(jSONObject.getJSONObject("pic"), bVar);
            }
            bVar.e = nwv.t(jSONObject.getString("factorValue"), 0);
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel a(com.alibaba.fastjson.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.data.a.a(com.alibaba.fastjson.JSONObject):com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel");
    }

    public static BrowserBadgeModel.BrowserTaskModel e(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserTaskModel) ipChange.ipc$dispatch("6a7adcb5", new Object[]{jSONObject, jSONObject2, jSONArray});
        }
        BrowserBadgeModel.BrowserTaskModel browserTaskModel = new BrowserBadgeModel.BrowserTaskModel();
        if (jSONObject != null && jSONObject.get("timerStatus") != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("timerStatus");
            browserTaskModel.f11806a = nwv.y(jSONObject3.getString("totalDuration"), 0L);
            browserTaskModel.b = nwv.y(jSONObject3.getString("currentDuration"), 0L);
            browserTaskModel.c = nwv.y(jSONObject3.getString(Constants.Name.INTERVAL), 0L);
        } else if (jSONObject2 != null) {
            browserTaskModel.f11806a = nwv.y(jSONObject2.getString("totalDuration"), 0L);
            browserTaskModel.b = nwv.y(jSONObject2.getString("currentDuration"), 0L);
            browserTaskModel.c = nwv.y(jSONObject2.getString(Constants.Name.INTERVAL), 0L);
        }
        if (jSONArray != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.size(); i++) {
                if (jSONArray.get(i) != null) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                    BrowserBadgeModel.BrowserTaskModel.ContentType l = l(jSONObject4.getString("contentType"));
                    BrowserBadgeModel.BrowserTaskModel.a aVar = new BrowserBadgeModel.BrowserTaskModel.a();
                    aVar.f11807a = nwv.y(jSONObject4.getString("singleTime"), 0L);
                    if (l != null) {
                        hashMap.put(l, aVar);
                    }
                }
            }
            browserTaskModel.d = hashMap;
        }
        return browserTaskModel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r5.equals("collection") == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType l(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tab2interact.core.component.browser.data.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "48619eaf"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = (com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType) r5
            return r5
        L_0x0015:
            r2 = 0
            if (r5 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1741312354: goto L_0x005f;
                case -1247876910: goto L_0x0053;
                case 100897: goto L_0x0047;
                case 3322092: goto L_0x003b;
                case 112202875: goto L_0x002f;
                case 1391462382: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            r0 = -1
            goto L_0x0068
        L_0x0023:
            java.lang.String r0 = "picture_album"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0 = 5
            goto L_0x0068
        L_0x002f:
            java.lang.String r0 = "video"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0039
            goto L_0x0021
        L_0x0039:
            r0 = 4
            goto L_0x0068
        L_0x003b:
            java.lang.String r0 = "live"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0045
            goto L_0x0021
        L_0x0045:
            r0 = 3
            goto L_0x0068
        L_0x0047:
            java.lang.String r0 = "ext"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0051
            goto L_0x0021
        L_0x0051:
            r0 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r0 = "gggame"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x005d
            goto L_0x0021
        L_0x005d:
            r0 = 1
            goto L_0x0068
        L_0x005f:
            java.lang.String r1 = "collection"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0068
            goto L_0x0021
        L_0x0068:
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0078;
                case 2: goto L_0x0075;
                case 3: goto L_0x0072;
                case 4: goto L_0x006f;
                case 5: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            return r2
        L_0x006c:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType.PICTURE_ALBUM
            return r5
        L_0x006f:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType.VIDEO
            return r5
        L_0x0072:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType.LIVE
            return r5
        L_0x0075:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType.EXT
            return r5
        L_0x0078:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType.GG_GAME
            return r5
        L_0x007b:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType r5 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserTaskModel.ContentType.COLLECTION
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.data.a.l(java.lang.String):com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserTaskModel$ContentType");
    }

    public static boolean r(BrowserBadgeModel browserBadgeModel) {
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel;
        BrowserBadgeModel.BrowserTaskModel browserTaskModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b05e007c", new Object[]{browserBadgeModel})).booleanValue();
        }
        if (browserBadgeModel == null) {
            vgh.c(null, "BrowserBadgeResponseDataProcessor", "验证浏览挂角数据有效性，browserBadgeModel为空");
            return false;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = browserBadgeModel.f;
        if (browserBadgeViewModel == null || (hVar = browserBadgeViewModel.b) == null || (picModel = hVar.e) == null || TextUtils.isEmpty(picModel.b)) {
            vgh.c(null, "BrowserBadgeResponseDataProcessor", "验证浏览挂角数据有效性，browserBadgeViewModel.mMiddleAreaModel.mCenterPicModel.mUrl获取不到或为空");
            return false;
        } else if (browserBadgeModel.d || ((browserTaskModel = browserBadgeModel.e) != null && browserTaskModel.f11806a > 0 && browserTaskModel.b >= 0)) {
            return true;
        } else {
            vgh.c(null, "BrowserBadgeResponseDataProcessor", "验证浏览挂角数据有效性，browserTaskModel不满足条件");
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r6.equals("PNG") == false) goto L_0x004b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type j(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tab2interact.core.component.browser.data.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "631899b9"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r1[r2] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r1)
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserBadgeViewModel$PicModel$Type r6 = (com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type) r6
            return r6
        L_0x0018:
            r3 = 0
            if (r6 != 0) goto L_0x0040
            if (r7 == 0) goto L_0x0040
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: Exception -> 0x0037
            if (r7 == 0) goto L_0x0040
            java.lang.String r7 = r7.getPath()     // Catch: Exception -> 0x0037
            if (r7 == 0) goto L_0x0040
            r4 = 46
            int r4 = r7.lastIndexOf(r4)     // Catch: Exception -> 0x0037
            if (r4 < 0) goto L_0x0040
            int r4 = r4 + r2
            java.lang.String r6 = r7.substring(r4)     // Catch: Exception -> 0x0037
            goto L_0x0040
        L_0x0037:
            r7 = move-exception
            java.lang.String r4 = "BrowserBadgeResponseDataProcessor"
            java.lang.String r5 = "浏览挂角通过图片url解析类型异常"
            tb.vgh.d(r3, r4, r5, r7)
        L_0x0040:
            if (r6 != 0) goto L_0x0043
            return r3
        L_0x0043:
            r7 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 79369: goto L_0x006f;
                case 111145: goto L_0x0063;
                case 2015784: goto L_0x0058;
                case 3000872: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            r0 = -1
            goto L_0x0078
        L_0x004d:
            java.lang.String r0 = "apng"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0056
            goto L_0x004b
        L_0x0056:
            r0 = 3
            goto L_0x0078
        L_0x0058:
            java.lang.String r0 = "APNG"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0061
            goto L_0x004b
        L_0x0061:
            r0 = 2
            goto L_0x0078
        L_0x0063:
            java.lang.String r0 = "png"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x006d
            goto L_0x004b
        L_0x006d:
            r0 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r1 = "PNG"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0078
            goto L_0x004b
        L_0x0078:
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007f;
                case 2: goto L_0x007c;
                case 3: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r3
        L_0x007c:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserBadgeViewModel$PicModel$Type r6 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.APNG
            return r6
        L_0x007f:
            com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserBadgeViewModel$PicModel$Type r6 = com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.PNG
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.data.a.j(java.lang.String, java.lang.String):com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$BrowserBadgeViewModel$PicModel$Type");
    }
}
