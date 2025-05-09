package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.umipublish.draft.DraftManager;
import com.taobao.umipublish.draft.DraftModel;
import java.util.List;
import java.util.Map;
import tb.dov;
import tb.knv;
import tb.l4n;
import tb.o0c;
import tb.odg;
import tb.t2o;
import tb.trt;
import tb.wdv;
import tb.ydv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiDraftInterceptor implements o0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long lastClickTime = 0;
    private final long FAST_CLICK_DELAY_TIME = 1000;

    static {
        t2o.a(944767084);
        t2o.a(511705321);
    }

    public static /* synthetic */ void access$000(UmiDraftInterceptor umiDraftInterceptor, Context context, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4e75bb", new Object[]{umiDraftInterceptor, context, draftModel});
        } else {
            umiDraftInterceptor.openDraft(context, draftModel);
        }
    }

    private String getParamsByUri(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("164c21a5", new Object[]{this, uri, str, str2});
        }
        String queryParameter = uri.getQueryParameter(l4n.f23108a);
        if (!TextUtils.isEmpty(queryParameter)) {
            return dov.b(queryParameter).n(str, str2);
        }
        return uri.getQueryParameter(str);
    }

    private boolean isRepeatedClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f32ddbaf", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - lastClickTime < 1000) {
            return true;
        }
        lastClickTime = elapsedRealtime;
        return false;
    }

    private boolean needIntercept(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe538658", new Object[]{this, uri})).booleanValue();
        }
        String[] strArr = {UmiWvPlugin.NEW_RECORD_PATH, UmiWvPlugin.NEW_RECORD_PATH_DIRECT};
        for (int i = 0; i < 2; i++) {
            if (knv.i(uri, Uri.parse(strArr[i]))) {
                return true;
            }
        }
        return false;
    }

    private void openDraft(final Context context, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e6c25", new Object[]{this, context, draftModel});
            return;
        }
        Map<String, String> map = draftModel.urlParams;
        if (map != null) {
            String str = "1";
            map.put("xgc", str);
            draftModel.urlParams.put("is_native_draft", str);
            Map<String, String> map2 = draftModel.urlParams;
            if (!ydv.q()) {
                str = "0";
            }
            map2.put(UmiWvPlugin.KEY_XGC_SIMPLE_PUBLISH, str);
            final Uri d = knv.d(UmiWvPlugin.NEW_PUBLISH_PATH, draftModel.urlParams);
            final Bundle bundle = new Bundle();
            bundle.putString(DraftManager.DRAFT_URL_KEY, draftModel.toString());
            trt.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiDraftInterceptor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Nav.from(context).withExtras(bundle).toUri(d);
                    }
                }
            });
        }
    }

    @Override // tb.vic
    public void nav(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7d1fc1", new Object[]{this, intent, context});
        }
    }

    private String getDraftCoverUrl(DraftModel draftModel) {
        DraftModel.Meta meta;
        List<DraftModel.Video> list;
        DraftModel.Video video;
        List<DraftModel.Photo> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f1103db", new Object[]{this, draftModel});
        }
        if (!(draftModel == null || (meta = draftModel.meta) == null || TextUtils.isEmpty(meta.type))) {
            if ("photo".equals(draftModel.meta.type) && (list2 = draftModel.meta.photos) != null && list2.size() > 0) {
                DraftModel.Photo photo = draftModel.meta.photos.get(0);
                if (photo != null) {
                    return photo.localUrl;
                }
            } else if ("video".equals(draftModel.meta.type) && (list = draftModel.meta.videos) != null && list.size() > 0 && (video = draftModel.meta.videos.get(0)) != null) {
                return video.coverLocalUrl;
            }
        }
        return "";
    }

    @Override // tb.vic
    public boolean intercept(Intent intent, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debaad86", new Object[]{this, intent, context})).booleanValue();
        }
        if (!(ydv.b() || intent == null || intent.getData() == null || context == null)) {
            final Uri data = intent.getData();
            if (!needIntercept(data)) {
                return false;
            }
            String paramsByUri = getParamsByUri(data, "biz_scene", "guangguang");
            String paramsByUri2 = getParamsByUri(data, dov.KEY_IS_USE_NEW_PUBLISHER, "0");
            if (!"guangguang".equals(paramsByUri) || TextUtils.isEmpty(DraftManager.l(context).j("guangguang"))) {
                return false;
            }
            final DraftModel m = DraftManager.l(context).m("guangguang");
            String draftCoverUrl = getDraftCoverUrl(m);
            if (TextUtils.isEmpty(draftCoverUrl)) {
                draftCoverUrl = "https://img.alicdn.com/imgextra/i4/O1CN01guxPeP1frz78rRGU6_!!6000000004061-2-tps-420-420.png";
            }
            if (m != null && !TextUtils.isEmpty(m.draftId)) {
                Map<String, String> map = m.urlParams;
                if (map == null || !map.containsKey(dov.KEY_IS_USE_NEW_PUBLISHER) || TextUtils.equals(m.urlParams.get(dov.KEY_IS_USE_NEW_PUBLISHER), paramsByUri2)) {
                    final wdv wdvVar = new wdv(context, R.style.LCCustomDialog);
                    wdvVar.f(draftCoverUrl);
                    wdvVar.g(Localization.q(R.string.gg_pub_incomplete_work_continue));
                    wdvVar.i(Localization.q(R.string.gg_pub_continue), new wdv.e() { // from class: com.taobao.umipublish.extension.windvane.UmiDraftInterceptor.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.wdv.e
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e84bbff7", new Object[]{this});
                                return;
                            }
                            wdvVar.dismiss();
                            DraftManager.l(context).c(r4);
                            UmiDraftInterceptor.access$000(UmiDraftInterceptor.this, context, m);
                        }
                    });
                    wdvVar.h(Localization.q(R.string.gg_pub_cancel), new wdv.d(this) { // from class: com.taobao.umipublish.extension.windvane.UmiDraftInterceptor.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.wdv.d
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ebc0133c", new Object[]{this});
                                return;
                            }
                            wdvVar.dismiss();
                            DraftManager.l(context).c(r4);
                            Nav.from(context).toUri(data);
                        }
                    });
                    if (!isRepeatedClick()) {
                        wdvVar.show();
                    }
                    return true;
                }
                odg.c(DraftManager.TAG, "user = " + paramsByUri2 + ", last draft = " + m.urlParams.get(dov.KEY_IS_USE_NEW_PUBLISHER));
                return false;
            }
        }
        return false;
    }
}
