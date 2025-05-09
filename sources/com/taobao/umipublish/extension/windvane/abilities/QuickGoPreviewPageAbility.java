package com.taobao.umipublish.extension.windvane.abilities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.MultiVideoClips;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.nav.Nav;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.bean.AudioBean;
import java.util.List;
import java.util.Map;
import tb.dag;
import tb.muu;
import tb.q0j;
import tb.qrf;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class QuickGoPreviewPageAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_LITE_EDITOR_PREVIEW = "lite_editor_preview";
    public static final String KEY_RESULT = "result";
    public static final String KEY_STATE = "state";
    public static final String PREVIEW_ERROR_CODE = "6011";
    private static final String QUICK_PREVIEW_PATH = "https://h5.m.taobao.com/lc/entry/quick_preview.html";
    private static final String TAG = "QuickGoPreviewPageAbility";
    public static final String VALUE_STATE_NORMAL_EXIT = "normal_exit";
    public static final String VALUE_STATE_PUBLISH_EXIT = "publish_exit";
    private BroadcastReceiver mReceiver;

    static {
        t2o.a(944767180);
    }

    public static /* synthetic */ void access$000(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb93e59", new Object[]{jSONObject});
        } else {
            defaultParams(jSONObject);
        }
    }

    private static void defaultParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973f9882", new Object[]{jSONObject});
        } else {
            jSONObject.put("state", VALUE_STATE_NORMAL_EXIT);
        }
    }

    private void goPage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb03612", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback(PREVIEW_ERROR_CODE, "params is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("template_data");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("draft");
            String string = jSONObject3 != null ? jSONObject3.getString("path") : null;
            if (string == null) {
                errorCallback(PREVIEW_ERROR_CODE, "draftPath is null");
                return;
            }
            String string2 = jSONObject2.getString(q0j.SCENE_MEDIA_PLAYER);
            if (string2 == null) {
                errorCallback(PREVIEW_ERROR_CODE, "mediaInfo is null");
                return;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("publish_data");
            boolean w = muu.w(this.mContext);
            List parseArray = JSON.parseArray(string2, MultiVideoClips.MediaResource.class);
            EditorInfo editorInfo = new EditorInfo();
            Resource resource = new Resource();
            editorInfo.resource = resource;
            resource.originData = new MultiVideoClips(parseArray);
            Resource resource2 = editorInfo.resource;
            resource2.draftPath = string;
            resource2.type = Resource.TYPE_TEMPLATE_LITE;
            UGCVideo uGCVideo = new UGCVideo();
            uGCVideo.editorInfo = editorInfo;
            uGCVideo.setMeta("SourceFrom", "AlbumEffect");
            configVideoMusicInfo(jSONObject4, uGCVideo);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("publish_data", (Object) jSONObject4);
            jSONObject5.put("template_data", (Object) jSONObject2);
            replaceIfTextTplEmpty(jSONObject4);
            JSONObject jSONObject6 = jSONObject.getJSONObject("publish_params");
            if (w) {
                IUGCMedia n = muu.n(this.mContext);
                if (n == null) {
                    errorCallback(PREVIEW_ERROR_CODE, "ugcMedia null");
                    return;
                }
                n.resetMedia();
                n.getVideos().add(uGCVideo);
                n.setMeta("preview_data", jSONObject5);
                n.setMeta("publish_params", jSONObject6);
                progressCallback(100);
                Nav.from(this.mContext).toUri(dag.c(muu.d(n)).e("VIDEO_EDIT_PATH"));
            } else {
                progressCallback(100);
                if (!openQuickPreview(QUICK_PREVIEW_PATH, jSONObject5, jSONObject6, uGCVideo)) {
                    errorCallback(PREVIEW_ERROR_CODE, "preview nav fail");
                    return;
                }
            }
            registerPreviewResult();
        }
    }

    public static /* synthetic */ Object ipc$super(QuickGoPreviewPageAbility quickGoPreviewPageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickGoPreviewPageAbility");
    }

    private void registerPreviewResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcb67a9", new Object[]{this});
            return;
        }
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickGoPreviewPageAbility$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                JSONObject jSONObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                if (intent == null) {
                    QuickGoPreviewPageAbility.access$000(jSONObject2);
                } else {
                    if (!(intent.getSerializableExtra("result") == null || (jSONObject = (JSONObject) intent.getSerializableExtra("result")) == null || !jSONObject.containsKey("contentId"))) {
                        jSONObject2.put("contentId", (Object) jSONObject.getString("contentId"));
                    }
                    String stringExtra = intent.getStringExtra("state");
                    if (stringExtra != null) {
                        jSONObject2.put("state", (Object) stringExtra);
                    } else {
                        QuickGoPreviewPageAbility.access$000(jSONObject2);
                    }
                }
                LocalBroadcastManager.getInstance(QuickGoPreviewPageAbility.this.mContext).unregisterReceiver(this);
                QuickGoPreviewPageAbility.this.successCallback(jSONObject2);
                IUGCMedia n = muu.n(QuickGoPreviewPageAbility.this.mContext);
                if (n != null) {
                    n.resetMedia();
                }
            }
        };
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mReceiver, new IntentFilter(ACTION_LITE_EDITOR_PREVIEW));
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else {
            goPage(jSONObject);
        }
    }

    private static void configVideoMusicInfo(JSONObject jSONObject, UGCVideo uGCVideo) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f9fafd", new Object[]{jSONObject, uGCVideo});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(AbilityConst.Server.f14056a);
        if (jSONObject3 != null && (jSONArray = jSONObject3.getJSONArray(AbilityConst.Server.b)) != null && jSONArray.size() != 0 && (jSONObject2 = jSONArray.getJSONObject(0)) != null) {
            String n = qrf.n(null, jSONObject2, yj4.PARAM_EXTEND, "videoConfig", "musicId");
            if (!TextUtils.isEmpty(n)) {
                AudioBean audioBean = new AudioBean();
                audioBean.id = n;
                audioBean.pieceAudioId = qrf.n(null, jSONObject2, yj4.PARAM_EXTEND, "videoConfig", "audioId");
                audioBean.vender_type = qrf.n(null, jSONObject2, yj4.PARAM_EXTEND, "videoConfig", "musicVendor");
                uGCVideo.setMeta("music_bean_preview", JSON.toJSONString(audioBean));
            }
        }
    }

    private boolean openQuickPreview(String str, JSONObject jSONObject, JSONObject jSONObject2, UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d62cf73a", new Object[]{this, str, jSONObject, jSONObject2, uGCVideo})).booleanValue();
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        if (!(this.mContext instanceof FragmentActivity)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("preview_data", jSONObject);
        bundle.putSerializable("preview_ugc_video", uGCVideo);
        bundle.putSerializable("publish_params", jSONObject2);
        Nav.from(this.mContext).withExtras(bundle).toUri(buildUpon.build());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void replaceIfTextTplEmpty(com.alibaba.fastjson.JSONObject r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "rawText"
            java.lang.String r3 = "literalText"
            java.lang.String r4 = "textTpl"
            java.lang.String r5 = "recMaterialTool"
            java.lang.String r6 = ""
            com.android.alibaba.ip.runtime.IpChange r7 = com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.$ipChange
            boolean r8 = r7 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r8 == 0) goto L_0x0023
            java.lang.String r2 = "60a2208e"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r11
            r3[r0] = r12
            r7.ipc$dispatch(r2, r3)
            return
        L_0x0023:
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[]{r5}     // Catch: Exception -> 0x0045
            com.alibaba.fastjson.JSONObject r8 = tb.qrf.l(r12, r8)     // Catch: Exception -> 0x0045
            if (r8 == 0) goto L_0x0042
            com.alibaba.fastjson.JSONObject r7 = r8.getJSONObject(r4)     // Catch: Exception -> 0x003f
            if (r7 == 0) goto L_0x0042
            java.lang.String r9 = r7.getString(r3)     // Catch: Exception -> 0x003f
            java.lang.String r0 = r7.getString(r2)     // Catch: Exception -> 0x003d
            goto L_0x0056
        L_0x003d:
            r10 = move-exception
            goto L_0x0048
        L_0x003f:
            r10 = move-exception
            r9 = r6
            goto L_0x0048
        L_0x0042:
            r0 = r6
            r9 = r0
            goto L_0x0056
        L_0x0045:
            r10 = move-exception
            r9 = r6
            r8 = r7
        L_0x0048:
            java.lang.String r10 = r10.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r10
            java.lang.String r10 = "QuickGoPreviewPageAbility"
            tb.odg.c(r10, r0)
            r0 = r6
        L_0x0056:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0080
            java.lang.String r10 = "materialTool"
            java.lang.String[] r5 = new java.lang.String[]{r5, r10}
            com.alibaba.fastjson.JSONArray r12 = tb.qrf.a(r12, r5)
            if (r12 == 0) goto L_0x0080
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x0080
            com.alibaba.fastjson.JSONObject r12 = r12.getJSONObject(r1)
            java.lang.String r1 = "extend"
            java.lang.String r5 = "recommendedText"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            java.lang.String r6 = tb.qrf.n(r6, r12, r1)
        L_0x0080:
            if (r7 != 0) goto L_0x008c
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            if (r8 == 0) goto L_0x008c
            r8.put(r4, r7)
        L_0x008c:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L_0x009b
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 == 0) goto L_0x009b
            r7.put(r3, r6)
        L_0x009b:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L_0x00aa
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x00aa
            r7.put(r2, r6)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.replaceIfTextTplEmpty(com.alibaba.fastjson.JSONObject):void");
    }
}
