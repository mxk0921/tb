package com.taobao.umipublish.extension.windvane;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.taobao.util.Globals;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCMedia;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.nav.Nav;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.orange.OrangeConfig;
import com.taobao.runtimepermission.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.umipublish.ayscpublish.b;
import com.taobao.umipublish.draft.DraftManager;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.draft.b;
import com.taobao.umipublish.extension.mtop.MtopTaobaoMediaTaopaiAccountRoleRequest;
import com.taobao.umipublish.extension.windvane.ILCTabSwitcher;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility;
import com.taobao.umipublish.extension.windvane.abilities.OpenWeexPageAbility;
import com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility;
import com.taobao.umipublish.extension.windvane.abilities.Share2GGWindvaneCall;
import com.taobao.umipublish.extension.windvane.abilities.WVListener;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenAlbumFilmAbility;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenPublishAbility;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenRecordAbility;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import com.taobao.umipublish.util.RemoteEnvUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.act;
import tb.cg9;
import tb.dov;
import tb.eag;
import tb.ebg;
import tb.fkg;
import tb.fno;
import tb.htw;
import tb.kdp;
import tb.knv;
import tb.kpw;
import tb.kuu;
import tb.l4n;
import tb.m3v;
import tb.muu;
import tb.nsw;
import tb.odg;
import tb.p78;
import tb.qkg;
import tb.qrf;
import tb.slo;
import tb.t2o;
import tb.tep;
import tb.tpe;
import tb.trt;
import tb.vdv;
import tb.xbt;
import tb.ydv;
import tb.ypc;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiWvPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALBUM_PATH = "https://h5.m.taobao.com/litecreator/album.html";
    public static final String ASYNC_PUBLISH_CANCEL = "asyncPublishCancel";
    public static final String ASYNC_PUBLISH_FIRE_NOTIFICATION = "asyncPublishFireNotification";
    public static final String BASE_64 = "base64";
    private static final String CAN_PRELOAD_PARAMS = "canPreloadPublishParams";
    public static final String CLOSE_FLOAT_WEB_PAGE = "closeFloatWebPage";
    private static final String CLOSE_LC_PAGE = "closeLCPage";
    private static final String CLOSE_WEEX_ACTION = "closeWeex";
    public static final String CLOSE_WEEX_FLOAT_PAGE_ACTION = "closeWeexFloatPage";
    public static final String COVERPICK_PATH_NEW = "https://h5.m.taobao.com/litecreator/video_coverpick_new.html";
    private static final String DELETE_DRAFTS = "deleteDrafts";
    public static final String ENTRY_CLASS_NAME = "com.taobao.umipublish.tnode.LiteCreateEntryActivity";
    private static final String FETCH_DRAFT_LIST = "fetchDraftList";
    public static final String GET_FLOAT_WEB_PAGE_PARAMS = "getFloatWebPageParams";
    public static final String GET_FLOAT_WEEX_PAGE_PARAMS = "getFloatWeexPageParams";
    private static final String GET_PUBLISH_CONFIG = "publishConfig";
    private static final String GET_PUBLISH_CONFIG_V2 = "getPublishConfig";
    private static final String GET_REMOTE_MODULE_SWITCH = "getRemoteModuleSwitch";
    private static final String GET_VIDEO_AND_PHOTO_BIZ_CODE = "getVideoAndPhotoBizCode";
    private static final String IMAGE_CUTOUT_STROKE = "imageCutoutAndStroke";
    public static final String KEY_IMPORT_PICS = "import_pics";
    public static final String KEY_IMPORT_PIC_BASE_64 = "import_pic_base64";
    public static final String KEY_IS_IMPORT_MEDIA_MODE = "is_import_media_mode";
    private static final String KEY_IS_TAOPAI_REMOTE_MODULE = "is_taopai_remote_module";
    public static final String KEY_PATH = "path";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String KEY_VIDEO_COVER = "cover";
    public static final String KEY_XGC_SIMPLE_PUBLISH = "xgc_simple_publish";
    public static final String K_RET_CODE = "errorCode";
    public static final String K_RET_MSG = "message";
    private static final String LE_VERSION_ACTION = "getTemplateMaterialVersion";
    public static final String LINK_PUBLISH_ACTION = "linkPublish";
    private static final String MATERIAL_SDK_VERSION = "getMaterialSdkVersion";
    private static final long MILLISECOND_A_DAY = 86400000;
    public static final String NEW_IMAGEEDIT_PATH = "https://h5.m.taobao.com/litecreator/image_edit.html";
    public static final String NEW_PUBLISH_PATH = "https://h5.m.taobao.com/lc/entry/publish.html";
    public static final String NEW_RECORD_PATH = "https://h5.m.taobao.com/lc/entry/record.html";
    public static final String NEW_RECORD_PATH_DIRECT = "https://h5.m.taobao.com/litecreator/flat_record_directly.html";
    public static final String OPEN_AI_DRESS_ALBUM_PAGE = "openAIDressAlbum";
    public static final String OPEN_AI_FACE_COLLECTION = "openAIPhotoFaceCollection";
    private static final String OPEN_ALBUM_FILM_ACTION = "openAlbumFilm";
    public static final String OPEN_ASR_WINDOW = "openAsrWindow";
    private static final String OPEN_DRAFT = "openDraft";
    private static final String OPEN_NEW_WINDOW_ACTION = "openWindow";
    private static final String OPEN_PUBLISH_ACTION = "openPublish";
    private static final String OPEN_RECORD_ACTION = "openRecord";
    public static final String OPEN_REEDIT_PAGE = "openReEditPage";
    public static final String OPEN_SIMPLE_RECORD = "openSimpleRecord";
    public static final String OPEN_WEEX_FLOAT_PAGE_ACTION = "openWeexFloatPage";
    private static final String OPEN_WEEX_PAGE_ACTION = "openWeexPage";
    private static final String PAGE_ERR = "1001";
    private static final String PAGE_EXIT = "1009";
    private static final String PARAMS_ERR = "1000";
    private static final String PATH_UMI_WEEX = "https://h5.m.taobao.com/umi/weex_page.html";
    private static final String PHOTO_BIZ_CODE = "photo_biz_code";
    public static final String PLUGIN_NAME = "WVUmiPublish";
    private static final String PREPARE_ACTION = "prepare";
    private static final String QUERY_LAST_PUBLISH_TIME = "queryPublishTime";
    private static final String QUICK_PREVIEW = "quickPreview";
    public static final String QUICK_PUBLISH = "quickPublish";
    private static final String READ_LOCAL_IMAGE = "readLocalImage";
    public static final int REQUEST_CODE_FLOAT_WEEX_PAGE = 60005;
    private static final int REQUEST_CODE_FROM_AI_FACE_COLLECTION = 60003;
    public static final int REQUEST_CODE_FROM_ALBUM_PAGE = 60006;
    private static final int REQUEST_CODE_FROM_ASR = 60002;
    public static final int REQUEST_CODE_WEEX_PAGE = 60004;
    private static final String REQUEST_LOCATION_PERMISSION = "requestLocationPermission";
    public static final String RESULT_PARAMS = "result_params";
    private static final String SAVE_IMAGE = "saveImage";
    private static final String SWITCH_TAB = "switchTab";
    private static final String TAG = "UmiWvPlugin";
    private static final String VIDEO_BIZ_CODE = "video_biz_code";
    private static final String VIDEO_EDIT_PATH = "https://h5.m.taobao.com/lc/entry/video_edit.html";
    private static String[] mPermissions = {"android.permission.RECORD_AUDIO"};
    private static long sLastOpenTime = 0;
    private static String sUseXgcScenes;
    private String K_OUT_PAGE_VOICE_INPUT_CONTENT = "voice_input_content";
    private String K_OUT_PAGE_VOICE_INPUT_ERROR = "voice_input_error";
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private WVCallBackContext mWVCallBackContext;

    static {
        t2o.a(944767094);
    }

    public static /* synthetic */ boolean access$000(UmiWvPlugin umiWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fe13ffa", new Object[]{umiWvPlugin, jSONObject})).booleanValue();
        }
        return umiWvPlugin.openRecord(jSONObject);
    }

    public static /* synthetic */ boolean access$100(UmiWvPlugin umiWvPlugin, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6aa56", new Object[]{umiWvPlugin, jSONObject, wVCallBackContext})).booleanValue();
        }
        return umiWvPlugin.openPublish(jSONObject, wVCallBackContext);
    }

    public static /* synthetic */ Context access$1000(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f9e83221", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$1100(UmiWvPlugin umiWvPlugin, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5457c2f1", new Object[]{umiWvPlugin, wVCallBackContext, str});
        } else {
            umiWvPlugin.notifyError(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ void access$1200(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7824bf2b", new Object[]{umiWvPlugin});
        } else {
            umiWvPlugin.getBizCodeError();
        }
    }

    public static /* synthetic */ void access$1300(UmiWvPlugin umiWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527380c4", new Object[]{umiWvPlugin, jSONObject});
        } else {
            umiWvPlugin.openRecordAfterVersionChecked(jSONObject);
        }
    }

    public static /* synthetic */ void access$1400(UmiWvPlugin umiWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2233b463", new Object[]{umiWvPlugin, jSONObject});
        } else {
            umiWvPlugin.openRecordActivityAfterEnvReady(jSONObject);
        }
    }

    public static /* synthetic */ void access$1500(UmiWvPlugin umiWvPlugin, Intent intent, nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8952ed21", new Object[]{umiWvPlugin, intent, nswVar});
        } else {
            umiWvPlugin.putResultDataToWVResult(intent, nswVar);
        }
    }

    public static /* synthetic */ void access$1600(UmiWvPlugin umiWvPlugin, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811a1d39", new Object[]{umiWvPlugin, str});
        } else {
            umiWvPlugin.notifyError(str);
        }
    }

    public static /* synthetic */ Context access$1700(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("15f30a8", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$1800(UmiWvPlugin umiWvPlugin, JSONObject jSONObject, JSONArray jSONArray, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781161c4", new Object[]{umiWvPlugin, jSONObject, jSONArray, wVCallBackContext});
        } else {
            umiWvPlugin.startOpenPublishWithMedias(jSONObject, jSONArray, wVCallBackContext);
        }
    }

    public static /* synthetic */ Context access$1900(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("71380baa", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$200(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c9b55634", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$2000(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3f8974c0", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$2100(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f775e241", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ org.json.JSONObject access$2200(UmiWvPlugin umiWvPlugin, Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("b2bf8e69", new Object[]{umiWvPlugin, collection});
        }
        return umiWvPlugin.draftModelsToJsonObj(collection);
    }

    public static /* synthetic */ Handler access$2300(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("17bc4d9b", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mMainHandler;
    }

    public static /* synthetic */ void access$2400(UmiWvPlugin umiWvPlugin, Intent intent, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8f3846", new Object[]{umiWvPlugin, intent, wVCallBackContext});
        } else {
            umiWvPlugin.handleAskEveryoneData(intent, wVCallBackContext);
        }
    }

    public static /* synthetic */ Context access$2500(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d7279845", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$2600(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8f1405c6", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$2700(UmiWvPlugin umiWvPlugin, String str, String str2, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44a15df", new Object[]{umiWvPlugin, str, str2, runnable, runnable2});
        } else {
            umiWvPlugin.doOpenDraft(str, str2, runnable, runnable2);
        }
    }

    public static /* synthetic */ Context access$2800(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("feece0c8", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$2900(UmiWvPlugin umiWvPlugin, DraftModel draftModel, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c7b668", new Object[]{umiWvPlugin, draftModel, runnable, runnable2});
        } else {
            umiWvPlugin.openLitePublish(draftModel, runnable, runnable2);
        }
    }

    public static /* synthetic */ Context access$300(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("81a1c3b5", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$3000(UmiWvPlugin umiWvPlugin, DraftModel draftModel, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f82e57e", new Object[]{umiWvPlugin, draftModel, runnable, runnable2});
        } else {
            umiWvPlugin.openVideoEdit(draftModel, runnable, runnable2);
        }
    }

    public static /* synthetic */ void access$3100(UmiWvPlugin umiWvPlugin, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3b103", new Object[]{umiWvPlugin, draftModel});
        } else {
            umiWvPlugin.openMainPublish(draftModel);
        }
    }

    public static /* synthetic */ Context access$3200(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f5039261", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$3300(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("acefffe2", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ WVCallBackContext access$400(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("3d72b115", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mWVCallBackContext;
    }

    public static /* synthetic */ Context access$500(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f17a9eb7", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ Context access$600(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a9670c38", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$700(UmiWvPlugin umiWvPlugin, Context context, JSONObject jSONObject, vdv vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe819b1", new Object[]{umiWvPlugin, context, jSONObject, vdvVar});
        } else {
            umiWvPlugin.autoFillConfig(context, jSONObject, vdvVar);
        }
    }

    public static /* synthetic */ Context access$800(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("193fe73a", new Object[]{umiWvPlugin});
        }
        return umiWvPlugin.mContext;
    }

    public static /* synthetic */ void access$900(UmiWvPlugin umiWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75df4ec3", new Object[]{umiWvPlugin});
        } else {
            umiWvPlugin.onClosePage();
        }
    }

    private void addEnableImageMusicFlagIfNeed(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f0d8bc", new Object[]{this, jSONObject});
        } else if (!jSONObject.containsKey(dov.KEY_ENABLE_IMAGE_MUSIC)) {
            if (ydv.d(jSONObject.getString("biz_scene"))) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put(dov.KEY_ENABLE_IMAGE_MUSIC, (Object) str);
        }
    }

    private void autoFillConfig(final Context context, JSONObject jSONObject, final vdv<JSONObject> vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117f49ab", new Object[]{this, context, jSONObject, vdvVar});
        } else if (jSONObject.getBooleanValue("autoFillConfig")) {
            new PublishConfigManager().g(context, jSONObject, new vdv<String>(this) { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: b */
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12157bae", new Object[]{this, str});
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject == null) {
                        ebg.l(context, Localization.q(R.string.gg_pub_opening_failed_try_later));
                        vdvVar.a(null);
                    } else if (TextUtils.equals(parseObject.getString("status"), "0") || TextUtils.isEmpty(parseObject.getString("actionUrl"))) {
                        vdvVar.a(parseObject.getJSONObject("publishParams"));
                    } else {
                        Nav.from(context).toUri(parseObject.getString("actionUrl"));
                        vdvVar.a(null);
                    }
                }
            });
        } else {
            vdvVar.a(jSONObject);
        }
    }

    private void canPreloadParams() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43b806", new Object[]{this});
            return;
        }
        long f = fno.f("last_enter_pub_time", 0L);
        if (f == 0 || System.currentTimeMillis() - f >= ydv.l() * 86400000) {
            str = "NO";
        } else {
            str = slo.VALUE_YES;
        }
        nsw nswVar = new nsw();
        nswVar.b("has_preload", str);
        this.mWVCallBackContext.success(nswVar);
    }

    private boolean checkFastClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7ececef", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - sLastOpenTime < ydv.g()) {
            return true;
        }
        sLastOpenTime = elapsedRealtime;
        return false;
    }

    private boolean closeWeex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("262a0624", new Object[]{this})).booleanValue();
        }
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            return false;
        }
        ((Activity) context).finish();
        this.mWVCallBackContext.success();
        return true;
    }

    private String createSessionIdAndUrlParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7db3294a", new Object[]{this, jSONObject});
        }
        String uuid = UUID.randomUUID().toString();
        dov.a aVar = new dov.a();
        aVar.r(jSONObject);
        aVar.o().put(l4n.f23108a, uuid);
        dov.d(uuid, aVar);
        return uuid;
    }

    public static UGCImage createUGCImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("464c1d13", new Object[]{str});
        }
        ImageBean k = kuu.k(str);
        if (k == null) {
            return null;
        }
        UGCImage uGCImage = new UGCImage();
        uGCImage.origin = k;
        uGCImage.compress = k;
        return uGCImage;
    }

    private static UGCMedia deserialization(String str) {
        ObjectInputStream objectInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCMedia) ipChange.ipc$dispatch("ee4d7ad3", new Object[]{str});
        }
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
        } catch (Throwable unused) {
            objectInputStream = null;
        }
        try {
            UGCMedia uGCMedia = (UGCMedia) objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (IOException unused2) {
            }
            return uGCMedia;
        } catch (Throwable unused3) {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        }
    }

    private void doOpenDraft(final String str, final String str2, final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0dfe43", new Object[]{this, str, str2, runnable, runnable2});
        } else {
            DraftManager.l(this.mContext).v(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.27
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final DraftModel h = DraftManager.l(UmiWvPlugin.access$2800(UmiWvPlugin.this)).h(str, str2);
                    if (h != null) {
                        trt.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.27.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                String str3;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                DraftModel.Meta meta = h.meta;
                                if (meta != null) {
                                    str3 = meta.mode;
                                } else {
                                    str3 = "";
                                }
                                if (TextUtils.equals(str3, "lite")) {
                                    AnonymousClass27 r0 = AnonymousClass27.this;
                                    UmiWvPlugin.access$2900(UmiWvPlugin.this, h, runnable, runnable2);
                                } else if (TextUtils.equals(str3, "quick")) {
                                    AnonymousClass27 r02 = AnonymousClass27.this;
                                    UmiWvPlugin.access$3000(UmiWvPlugin.this, h, runnable, runnable2);
                                } else {
                                    UmiWvPlugin.access$3100(UmiWvPlugin.this, h);
                                }
                            }
                        });
                        trt.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.27.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Runnable runnable3 = runnable;
                                if (runnable3 != null) {
                                    runnable3.run();
                                }
                            }
                        });
                    } else if (runnable2 != null) {
                        UmiWvPlugin.access$2300(UmiWvPlugin.this).post(runnable2);
                    }
                }
            });
        }
    }

    private org.json.JSONObject draftModelsToJsonObj(Collection<DraftModel> collection) {
        DraftModel.Meta meta;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("5b367cef", new Object[]{this, collection});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (collection != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (DraftModel draftModel : collection) {
                    if (!TextUtils.equals(b.a().f13976a, draftModel.draftId) && ((meta = draftModel.meta) == null || !TextUtils.equals(meta.mode, "lite") || ydv.e())) {
                        DraftModel.Meta meta2 = draftModel.meta;
                        if (meta2 == null || !TextUtils.equals(meta2.mode, "quick") || eag.f()) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(JSON.toJSONString(draftModel.meta));
                            jSONObject2.put("biz", draftModel.biz);
                            jSONObject2.put("draftId", draftModel.draftId);
                            jSONObject2.put("timestamp", draftModel.modificationTimestamp);
                            jSONObject2.put("version", draftModel.version);
                            jSONObject2.put("failedCode", draftModel.failedCode);
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
                jSONObject.put("drafts", jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private void filterInnerOpenParamsIfHave(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffb5c96", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            jSONObject.remove("images");
            jSONObject.remove("video");
            jSONObject.remove(InnerOpenPublishAbility.PARAMS_URL_PARAMS);
        }
    }

    private void getBizCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58051045", new Object[]{this});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("photo_biz_code", "");
        nswVar.b("video_biz_code", "anchor_daren_video_publish");
        this.mWVCallBackContext.success(nswVar);
    }

    public static String getCoverPickPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca6ed748", new Object[]{str});
        }
        return COVERPICK_PATH_NEW;
    }

    private void getImportMediasList(boolean z, boolean z2, JSONObject jSONObject, final vdv<JSONArray> vdvVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d73549", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject, vdvVar});
            return;
        }
        final JSONArray jSONArray2 = new JSONArray();
        if (z && (jSONArray = jSONObject.getJSONArray(KEY_IMPORT_PICS)) != null && jSONArray.size() > 0) {
            jSONArray2.addAll(jSONArray);
        }
        if (z2) {
            final String string = jSONObject.getString(KEY_IMPORT_PIC_BASE_64);
            trt.b(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String b = tpe.b(UmiWvPlugin.access$1900(UmiWvPlugin.this), string);
                    if (cg9.m(b)) {
                        jSONArray2.add(b);
                    }
                }
            }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        vdvVar.a(jSONArray2);
                    }
                }
            });
            return;
        }
        vdvVar.a(jSONArray2);
    }

    private void getLastPublishTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7855ee57", new Object[]{this});
            return;
        }
        long f = fno.f("last_pub_suc_time", 0L);
        nsw nswVar = new nsw();
        nswVar.a("publish_timestamp", Long.valueOf(f / 1000));
        this.mWVCallBackContext.success(nswVar);
    }

    private void getRemoteModuleSwitch(final Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405afb0b", new Object[]{this, context, jSONObject});
            return;
        }
        boolean d = xbt.d();
        if (!d) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xbt.i(context.getApplicationContext());
                    }
                }
            });
        }
        nsw nswVar = new nsw();
        nswVar.a("is_taopai_remote", Boolean.valueOf(isTaopaiRemote(context)));
        nswVar.a("is_taopai_init", Boolean.valueOf(d));
        this.mWVCallBackContext.success(nswVar);
    }

    private static String getTopActivityName(Context context) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51d023d8", new Object[]{context});
        }
        try {
            componentName = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity;
            return componentName.getClassName();
        } catch (Throwable unused) {
            return "";
        }
    }

    private void handleAskEveryoneData(Intent intent, WVCallBackContext wVCallBackContext) {
        org.json.JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f2607", new Object[]{this, intent, wVCallBackContext});
            return;
        }
        String stringExtra = intent.getStringExtra("UGCMediaData");
        if (TextUtils.isEmpty(stringExtra)) {
            wVCallBackContext.error();
            odg.c(TAG, "handleAskEveryoneData fail, UGCMediaData is empty");
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(stringExtra);
        } catch (Exception e) {
            wVCallBackContext.error();
            odg.c(TAG, Log.getStackTraceString(e));
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            wVCallBackContext.error();
            odg.c(TAG, "handleAskEveryoneData fail, ugcMediaDataJson is empty");
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw("HY_SUCCESS");
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
            odg.c(TAG, "handleAskEveryoneData success, data = " + jSONObject);
        } else {
            odg.c(TAG, "handleAskEveryoneData fail, wvCallBackContext is null");
        }
    }

    private void initUseXgcScenes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa86bcb", new Object[]{this});
        } else {
            sUseXgcScenes = OrangeConfig.getInstance().getConfig("umipublish", "use_xgc_scenes", "guangguang");
        }
    }

    public static /* synthetic */ Object ipc$super(UmiWvPlugin umiWvPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiWvPlugin");
    }

    private boolean isNeedCheckRemoteModuleState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ab158c", new Object[]{this, str})).booleanValue();
        }
        if (CAN_PRELOAD_PARAMS.equalsIgnoreCase(str) || GET_REMOTE_MODULE_SWITCH.equalsIgnoreCase(str) || FETCH_DRAFT_LIST.equalsIgnoreCase(str) || MATERIAL_SDK_VERSION.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    private boolean isTemplateSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59bf4cd5", new Object[]{this})).booleanValue();
        }
        if (qkg.b()) {
            this.mWVCallBackContext.error();
        } else {
            this.mWVCallBackContext.success();
        }
        return true;
    }

    private static boolean isTopActivityEntry(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0624f8d", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals(getTopActivityName(context), ENTRY_CLASS_NAME);
    }

    public static boolean isXgcDegrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9860d461", new Object[]{str})).booleanValue();
        }
        try {
            if (Arrays.asList(sUseXgcScenes.split(",")).indexOf(str) < 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private void notifyError(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97731c8d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_FAILED");
        nswVar.b("message", str);
        nswVar.b("errorCode", PAGE_EXIT);
        wVCallBackContext.error(nswVar);
    }

    private void onClosePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d5b60f", new Object[]{this});
            return;
        }
        Activity activity = (Activity) this.mContext;
        if (!activity.isFinishing()) {
            activity.finish();
        }
    }

    private boolean open(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fed64f9", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if ((this.mContext instanceof FragmentActivity) && !checkFastClick()) {
            return startXgcActivity(null, knv.c(str, jSONObject));
        }
        return true;
    }

    private void openLitePublish(DraftModel draftModel, final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d7d6f5", new Object[]{this, draftModel, runnable, runnable2});
            return;
        }
        JSONObject parseObject = JSON.parseObject(draftModel.rawJson);
        if (parseObject != null) {
            JSONObject jSONObject = parseObject.getJSONObject("data");
            if (jSONObject != null) {
                setDraftId(jSONObject, draftModel.draftId);
            }
            QuickPreviewAbility quickPreviewAbility = new QuickPreviewAbility();
            quickPreviewAbility.setContext(this.mContext);
            quickPreviewAbility.setListener(new BaseAbility.Listener(this) { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.28
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                        return;
                    }
                    Runnable runnable3 = runnable2;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                public void onProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                public void onSuccess(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("980108a5", new Object[]{this, jSONObject2});
                        return;
                    }
                    Runnable runnable3 = runnable;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                }
            });
            quickPreviewAbility.execute(parseObject);
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    private void openMainPublish(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891d870e", new Object[]{this, draftModel});
            return;
        }
        final Uri.Builder buildUpon = Uri.parse(NEW_PUBLISH_PATH).buildUpon();
        for (Map.Entry<String, String> entry : draftModel.urlParams.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String str = "1";
        buildUpon.appendQueryParameter("xgc", str);
        buildUpon.appendQueryParameter("is_native_draft", str);
        if (!ydv.q()) {
            str = "0";
        }
        buildUpon.appendQueryParameter(KEY_XGC_SIMPLE_PUBLISH, str);
        final Bundle bundle = new Bundle();
        bundle.putString(DraftManager.DRAFT_URL_KEY, draftModel.toString());
        this.mMainHandler.post(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Nav.from(UmiWvPlugin.access$3200(UmiWvPlugin.this)).withExtras(bundle).toUri(buildUpon.build());
                }
            }
        });
    }

    private boolean openPublishByImportMedias(final JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b39203a", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        boolean containsKey = jSONObject.containsKey(KEY_IMPORT_PICS);
        boolean containsKey2 = jSONObject.containsKey(KEY_IMPORT_PIC_BASE_64);
        if (!containsKey && !containsKey2) {
            return false;
        }
        getImportMediasList(containsKey, containsKey2, jSONObject, new vdv<JSONArray>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: b */
            public void a(JSONArray jSONArray) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c970c0c", new Object[]{this, jSONArray});
                } else {
                    UmiWvPlugin.access$1800(UmiWvPlugin.this, jSONObject, jSONArray, wVCallBackContext);
                }
            }
        });
        return true;
    }

    private void openPublishWithImportMedias(JSONObject jSONObject, JSONArray jSONArray, WVCallBackContext wVCallBackContext) {
        UGCImage createUGCImage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231cff8f", new Object[]{this, jSONObject, jSONArray, wVCallBackContext});
            return;
        }
        UGCMedia uGCMedia = new UGCMedia();
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string) && (createUGCImage = createUGCImage(string)) != null) {
                uGCMedia.appendImage(createUGCImage);
            }
        }
        if (uGCMedia.getImages().size() <= 0) {
            notifyError(wVCallBackContext, Localization.q(R.string.gg_pub_media_data_incorrect));
            return;
        }
        Uri.Builder buildUpon = Uri.parse(NEW_PUBLISH_PATH).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        Uri build = buildUpon.build();
        uGCMedia.initPublishSessionId(build);
        dov.a(uGCMedia.getPublishSessionId(), build);
        Bundle bundle = new Bundle();
        bundle.putSerializable(IWorkflowData.KEY, uGCMedia);
        Nav.from(this.mContext).withExtras(bundle).toUri(build);
    }

    private void openRecordActivity(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b394521f", new Object[]{this, jSONObject});
        } else if ((this.mContext instanceof FragmentActivity) && !checkFastClick()) {
            String m = qrf.m(jSONObject, "biz_scene", "guangguang");
            Context application = Globals.getApplication();
            if (application == null) {
                application = this.mContext;
            }
            RemoteEnvUtil.a(application, m, new RemoteEnvUtil.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
                    }
                }

                @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fbd923b9", new Object[]{this});
                    } else {
                        UmiWvPlugin.access$1400(UmiWvPlugin.this, jSONObject);
                    }
                }
            });
        }
    }

    private void openRecordActivityAfterEnvReady(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de9e8e1", new Object[]{this, jSONObject});
            return;
        }
        String m = qrf.m(jSONObject, "biz_scene", "guangguang");
        boolean t = ydv.t(m);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(l4n.f23108a, (Object) createSessionIdAndUrlParams(jSONObject));
        if (t) {
            str = NEW_RECORD_PATH_DIRECT;
        } else {
            str = NEW_RECORD_PATH;
        }
        Uri c = knv.c(str, jSONObject2);
        if (t) {
            openRecordDirectly(c, m);
            odg.d(TAG, "UmiWvPlugin.startRecordRedirect");
            return;
        }
        startXgcActivity(null, c);
        odg.d(TAG, "UmiWvPlugin.startRecordNormal");
    }

    private void openRecordAfterVersionChecked(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83770fd9", new Object[]{this, jSONObject});
        } else {
            openRecordActivity(jSONObject);
        }
    }

    private void openRecordDirectly(Uri uri, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f812f4b9", new Object[]{this, uri, str});
            return;
        }
        Nav.from(this.mContext).toUri(uri);
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass19 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiWvPlugin$19");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                if (intent.getBooleanExtra("publish_success", true)) {
                    nsw nswVar = new nsw();
                    tep.a(intent, nswVar);
                    UmiWvPlugin.access$1500(UmiWvPlugin.this, intent, nswVar);
                    UmiWvPlugin.access$400(UmiWvPlugin.this).success(nswVar);
                } else if (!TextUtils.equals("x_ask_everyone", str)) {
                    UmiWvPlugin.access$1600(UmiWvPlugin.this, Localization.q(R.string.gg_pub_error_occurred_retry));
                }
                LocalBroadcastManager.getInstance(UmiWvPlugin.access$1700(UmiWvPlugin.this)).unregisterReceiver(this);
            }
        }, new IntentFilter("xgc_result"));
    }

    private void openSimpleRecord(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9971f099", new Object[]{this, jSONObject, wVCallBackContext});
        } else {
            autoFillConfig(this.mContext, jSONObject, new vdv<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.25
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: b */
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("627b648c", new Object[]{this, jSONObject2});
                    } else if (jSONObject2 != null) {
                        UmiWvPlugin.access$000(UmiWvPlugin.this, jSONObject2);
                        LocalBroadcastManager.getInstance(UmiWvPlugin.access$2600(UmiWvPlugin.this)).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.25.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiWvPlugin$25$1");
                            }

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, Intent intent) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                                    return;
                                }
                                AnonymousClass25 r5 = AnonymousClass25.this;
                                UmiWvPlugin.access$2400(UmiWvPlugin.this, intent, wVCallBackContext);
                                LocalBroadcastManager.getInstance(UmiWvPlugin.access$2500(UmiWvPlugin.this)).unregisterReceiver(this);
                            }
                        }, new IntentFilter("xgc_media_export_data_change"));
                    }
                }
            });
        }
    }

    private void openVideoEdit(DraftModel draftModel, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a55719", new Object[]{this, draftModel, runnable, runnable2});
        } else if (draftModel == null || draftModel.urlParams == null || TextUtils.isEmpty(draftModel.rawJson)) {
            runnable2.run();
        } else {
            Uri d = knv.d(VIDEO_EDIT_PATH, draftModel.urlParams);
            UGCMedia deserialization = deserialization(draftModel.rawJson);
            deserialization.setMeta("draftId", draftModel.draftId);
            deserialization.setMeta("onlyQuickPublishMode", Boolean.TRUE);
            Bundle bundle = new Bundle();
            bundle.putSerializable(IWorkflowData.KEY, deserialization);
            Nav.from(this.mContext).withExtras(bundle).toUri(d);
            runnable.run();
        }
    }

    private boolean prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1afb612", new Object[]{this})).booleanValue();
        }
        return true;
    }

    private void putResultDataToWVResult(Intent intent, nsw nswVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b9e83b", new Object[]{this, intent, nswVar});
            return;
        }
        JSONObject parseObject = JSON.parseObject(intent.getStringExtra("umi_publish_result_data"));
        if (parseObject != null) {
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (value == null) {
                    str = "";
                } else {
                    str = value.toString();
                }
                nswVar.b(key, str);
            }
        }
    }

    private static void setDraftId(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7777b9", new Object[]{jSONObject, str});
        } else if (jSONObject != null) {
            jSONObject.put("draftId", (Object) str);
        }
    }

    private void startOpenPublishWithMedias(JSONObject jSONObject, JSONArray jSONArray, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f6cb6", new Object[]{this, jSONObject, jSONArray, wVCallBackContext});
            return;
        }
        jSONObject.remove(KEY_IMPORT_PICS);
        jSONObject.remove(KEY_IMPORT_PIC_BASE_64);
        if (jSONArray.size() > 0) {
            jSONObject.put(KEY_IS_IMPORT_MEDIA_MODE, "1");
            openPublishWithImportMedias(jSONObject, jSONArray, wVCallBackContext);
            return;
        }
        notifyError(wVCallBackContext, Localization.q(R.string.gg_pub_media_data_incorrect));
    }

    private boolean startXgcActivity(Bundle bundle, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f731afbf", new Object[]{this, bundle, uri})).booleanValue() : startXgcActivity(bundle, uri, false);
    }

    private void updateRemoteModulePublishParams(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66bfa0f", new Object[]{this, jSONObject});
            return;
        }
        if (isTaopaiRemote(this.mContext)) {
            str = "1";
        } else {
            str = "0";
        }
        jSONObject.put(KEY_IS_TAOPAI_REMOTE_MODULE, (Object) str);
    }

    private void updateSimplePublishParams(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2770a82f", new Object[]{this, jSONObject});
            return;
        }
        if (ydv.q()) {
            str = "1";
        } else {
            str = "0";
        }
        jSONObject.put(KEY_XGC_SIMPLE_PUBLISH, (Object) str);
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    private boolean deleteDraft(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9de657", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("biz") || !jSONObject.containsKey(DraftManager.KEY_DRAFT_IDS)) {
            this.mWVCallBackContext.error(new nsw("参数缺失"));
            return true;
        }
        DraftManager.l(this.mContext).v(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final b.a f = DraftManager.l(UmiWvPlugin.access$3300(UmiWvPlugin.this)).f(jSONObject.getString("biz"), jSONObject.getJSONArray(DraftManager.KEY_DRAFT_IDS));
                UmiWvPlugin.access$2300(UmiWvPlugin.this).post(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.30.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (f.c) {
                            UmiWvPlugin.access$400(UmiWvPlugin.this).success(new nsw("删除成功"));
                        } else {
                            UmiWvPlugin.access$400(UmiWvPlugin.this).error(new nsw("删除失败"));
                        }
                    }
                });
            }
        });
        return true;
    }

    private boolean fetchDraftList(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd58ea28", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("biz")) {
            this.mWVCallBackContext.error(new nsw("参数缺失"));
            return true;
        }
        DraftManager.l(this.mContext).v(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (jSONObject.containsKey(dov.KEY_IS_CONTENT_ULTRA) && jSONObject.getInteger(dov.KEY_IS_CONTENT_ULTRA).intValue() == 1) {
                    z = true;
                }
                final org.json.JSONObject access$2200 = UmiWvPlugin.access$2200(UmiWvPlugin.this, DraftManager.l(UmiWvPlugin.access$2100(UmiWvPlugin.this)).i(jSONObject.getString("biz"), z));
                UmiWvPlugin.access$2300(UmiWvPlugin.this).post(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.24.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        nsw nswVar = new nsw();
                        nswVar.h(access$2200);
                        nswVar.j("HY_SUCCESS");
                        UmiWvPlugin.access$400(UmiWvPlugin.this).success(nswVar);
                    }
                });
            }
        });
        return true;
    }

    private boolean getVideoAndPhotoBizCode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8620ca4d", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("priorityType");
        final JSONObject jSONObject2 = jSONObject.getJSONObject("videoBizCodeMap");
        final JSONObject jSONObject3 = jSONObject.getJSONObject("photoBizCodeMap");
        MtopTaobaoMediaTaopaiAccountRoleRequest mtopTaobaoMediaTaopaiAccountRoleRequest = new MtopTaobaoMediaTaopaiAccountRoleRequest();
        mtopTaobaoMediaTaopaiAccountRoleRequest.setPriorityType(string);
        MtopBusiness.build(Mtop.instance(null), mtopTaobaoMediaTaopaiAccountRoleRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    UmiWvPlugin.access$1200(UmiWvPlugin.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String optString = mtopResponse.getDataJsonObject().optString("data");
                nsw nswVar = new nsw();
                JSONObject jSONObject4 = jSONObject2;
                if (jSONObject4 != null) {
                    nswVar.b("video_biz_code", jSONObject4.getString(optString));
                }
                JSONObject jSONObject5 = jSONObject3;
                if (jSONObject5 != null) {
                    nswVar.b("photo_biz_code", jSONObject5.getString(optString));
                }
                UmiWvPlugin.access$400(UmiWvPlugin.this).success(nswVar);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    UmiWvPlugin.access$1200(UmiWvPlugin.this);
                }
            }
        }).reqMethod(MethodEnum.POST).startRequest();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0043;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleClosePage(com.alibaba.fastjson.JSONObject r5, android.taobao.windvane.jsbridge.WVCallBackContext r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.umipublish.extension.windvane.UmiWvPlugin.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "7d7a4187"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            android.content.Context r1 = r4.mContext
            boolean r1 = r1 instanceof android.app.Activity
            java.lang.String r2 = "noLCPage"
            java.lang.String r3 = "-1"
            if (r1 != 0) goto L_0x002b
            tb.nsw r5 = tb.htw.a(r3, r2)
            r6.error(r5)
            return
        L_0x002b:
            if (r5 == 0) goto L_0x0041
            int r1 = r5.size()
            if (r1 <= 0) goto L_0x0041
            java.lang.String r1 = "targetTab"
            java.lang.String r5 = r5.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            java.lang.String r5 = "inspiration"
        L_0x0043:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class<com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker> r1 = com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker.class
            java.lang.Object r0 = tb.kdp.a(r1, r0)
            com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker r0 = (com.taobao.umipublish.extension.windvane.IExitBenefitDialogChecker) r0
            android.content.Context r1 = r4.mContext
            boolean r1 = r0.checkIsLCRecordPage(r1)
            if (r1 != 0) goto L_0x005d
            tb.nsw r5 = tb.htw.a(r3, r2)
            r6.error(r5)
            return
        L_0x005d:
            r6.success()
            android.content.Context r6 = r4.mContext
            com.taobao.umipublish.extension.windvane.UmiWvPlugin$8 r1 = new com.taobao.umipublish.extension.windvane.UmiWvPlugin$8
            r1.<init>()
            boolean r6 = r0.checkNeedShow(r6, r5, r1)
            if (r6 != 0) goto L_0x0073
            r0.stateUtTabQuit(r5)
            r4.onClosePage()
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.windvane.UmiWvPlugin.handleClosePage(com.alibaba.fastjson.JSONObject, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    private boolean isTaopaiRemote(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("285002ff", new Object[]{this, context})).booleanValue();
        }
        try {
            z = act.g();
        } catch (Throwable unused) {
            z = false;
        }
        UmiPublishMonitor.B("isTaopaiRemote=" + z, new Object[0]);
        return z;
    }

    private boolean openDraft(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65075036", new Object[]{this, jSONObject})).booleanValue();
        }
        if (checkFastClick()) {
            return true;
        }
        initUseXgcScenes();
        if (jSONObject == null || !jSONObject.containsKey("biz") || !jSONObject.containsKey("draftId")) {
            this.mWVCallBackContext.error(new nsw("参数缺失"));
            return true;
        }
        Context application = Globals.getApplication();
        if (application == null) {
            application = this.mContext;
        }
        RemoteEnvUtil.a(application, "guangguang", new RemoteEnvUtil.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
                }
            }

            @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fbd923b9", new Object[]{this});
                } else {
                    UmiWvPlugin.access$2700(UmiWvPlugin.this, jSONObject.getString("biz"), jSONObject.getString("draftId"), new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.26.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                UmiWvPlugin.access$400(UmiWvPlugin.this).success(new nsw());
                            }
                        }
                    }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.26.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                UmiWvPlugin.access$400(UmiWvPlugin.this).error(new nsw("草稿打开失败"));
                            }
                        }
                    });
                }
            }
        });
        return true;
    }

    private void openNewWebWindow(final Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c866eb7d", new Object[]{this, context, jSONObject});
            return;
        }
        final String string = jSONObject.getString("url");
        if (!TextUtils.isEmpty(string)) {
            if (qrf.b(jSONObject, "popBeforeOpen", false) && (context instanceof Activity)) {
                ((Activity) context).finish();
            }
            trt.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Nav.from(context).toUri(string);
                    }
                }
            });
            return;
        }
        notifyError("url为空");
    }

    private boolean openPublish(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b793445", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        jSONObject.put("xgc", "1");
        updateSimplePublishParams(jSONObject);
        addEnableImageMusicFlagIfNeed(jSONObject);
        if (openPublishByImportMedias(jSONObject, wVCallBackContext)) {
            return true;
        }
        open(NEW_PUBLISH_PATH, jSONObject);
        return true;
    }

    private void requestLocationPermission(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed83ed6", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey(z9u.KEY_TAOKE_BIZSCENE)) {
            str = jSONObject.getString(z9u.KEY_TAOKE_BIZSCENE);
        } else {
            str = "guangguang";
        }
        if (jSONObject.containsKey("rationalStr")) {
            str2 = jSONObject.getString("rationalStr");
        } else {
            str2 = Localization.q(R.string.gg_pub_location_function_needs_authorization);
        }
        a.c(this.mContext, new String[]{p78.ACCESS_FINE_LOCATION}).w(str2).z(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UmiWvPlugin.access$400(UmiWvPlugin.this).error(new nsw("HY_FAILED"));
                }
            }
        }).A(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UmiWvPlugin.access$400(UmiWvPlugin.this).success(new nsw("HY_SUCCESS"));
                }
            }
        }).x(true).t(str).m();
    }

    private boolean startXgcActivity(Bundle bundle, Uri uri, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef04fa7d", new Object[]{this, bundle, uri, new Boolean(z)})).booleanValue();
        }
        Nav.from(this.mContext).withExtras(bundle).toUri(uri);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("xgc_result");
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass23 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiWvPlugin$23");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                if (intent.getBooleanExtra("publish_success", true)) {
                    nsw nswVar = new nsw();
                    tep.a(intent, nswVar);
                    UmiWvPlugin.access$1500(UmiWvPlugin.this, intent, nswVar);
                    new StringBuilder("wvplugin callback: ").append(nswVar);
                    UmiWvPlugin.access$400(UmiWvPlugin.this).success(nswVar);
                } else if (z) {
                    nsw nswVar2 = new nsw();
                    UmiWvPlugin.access$1500(UmiWvPlugin.this, intent, nswVar2);
                    if (UmiWvPlugin.access$400(UmiWvPlugin.this) != null) {
                        UmiWvPlugin.access$400(UmiWvPlugin.this).success(nswVar2);
                    }
                    new StringBuilder("wvplugin callback: ").append(nswVar2);
                } else if (UmiWvPlugin.access$400(UmiWvPlugin.this) != null) {
                    UmiWvPlugin.access$400(UmiWvPlugin.this).error(htw.a(PreRequestPresenter.SOURCE_RATE_HISTORY, "USER_CANCELED"));
                }
                LocalBroadcastManager.getInstance(UmiWvPlugin.access$2000(UmiWvPlugin.this)).unregisterReceiver(this);
            }
        }, intentFilter);
        return true;
    }

    private boolean openRecord(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2fcf2", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!ydv.a() || isTopActivityEntry(this.mContext)) {
            ebg.l(this.mContext, Localization.q(R.string.gg_pub_tapping_too_quickly_wait));
            Toast.makeText(this.mContext.getApplicationContext(), getTopActivityName(this.mContext.getApplicationContext()), 1).show();
            new m3v("Page_GGTabs", "gg111.19920601").j("EntryClickTooFastTip", null);
            return true;
        }
        jSONObject.put("xgc", "1");
        updateSimplePublishParams(jSONObject);
        addEnableImageMusicFlagIfNeed(jSONObject);
        updateRemoteModulePublishParams(jSONObject);
        IMaterialVersionChecker iMaterialVersionChecker = (IMaterialVersionChecker) kdp.a(IMaterialVersionChecker.class, new Object[0]);
        if (iMaterialVersionChecker != null) {
            iMaterialVersionChecker.check(this.mContext, 0, jSONObject, new ypc.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ypc.a
                public void a(MaterialDetail materialDetail, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("62ff7e2c", new Object[]{this, materialDetail, str, str2});
                    } else if (materialDetail != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("t_id", String.valueOf(materialDetail.getTid()));
                        new m3v("Page_GGTabs", "gg111.19920601").j("FunUpdateWaring", hashMap);
                    }
                }

                @Override // tb.ypc.a
                public void b(MaterialDetail materialDetail) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b8060a9d", new Object[]{this, materialDetail});
                    } else {
                        UmiWvPlugin.access$1300(UmiWvPlugin.this, jSONObject);
                    }
                }
            });
        }
        return true;
    }

    private boolean openWeex(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae334c2", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("weexUrl");
        if (TextUtils.isEmpty(string)) {
            notifyError("weex页面链接无效");
            return false;
        }
        Uri.Builder buildUpon = Uri.parse(PATH_UMI_WEEX).buildUpon();
        buildUpon.appendQueryParameter("wxUrl", string);
        Nav.from(this.mContext).toUri(buildUpon.build());
        this.mWVCallBackContext.success();
        return true;
    }

    private void saveImage(Context context, JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd595e0a", new Object[]{this, context, jSONObject, wVCallBackContext});
        } else if (context == null || jSONObject == null || !jSONObject.containsKey("url")) {
            notifyError(wVCallBackContext, Localization.q(R.string.gg_pub_params_empty_try_later));
        } else {
            final String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("type");
            if (TextUtils.isEmpty(string2)) {
                string2 = "base64";
            }
            odg.c(TAG, "saveImage: type=" + string2);
            if (!TextUtils.equals(string2, "base64")) {
                notifyError(wVCallBackContext, Localization.q(R.string.gg_pub_format_not_supported));
                return;
            }
            final String[] strArr = new String[1];
            trt.b(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        strArr[0] = tpe.b(UmiWvPlugin.access$1000(UmiWvPlugin.this), string);
                    }
                }
            }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    nsw nswVar = new nsw();
                    if (!TextUtils.isEmpty(strArr[0])) {
                        nswVar.b("path", strArr[0]);
                        wVCallBackContext.success(nswVar);
                        return;
                    }
                    UmiWvPlugin.access$1100(UmiWvPlugin.this, wVCallBackContext, Localization.q(R.string.gg_pub_save_photo_failed_retry));
                }
            });
        }
    }

    private void switchTab(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ace765", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (!(this.mContext instanceof Activity) || jSONObject == null || jSONObject.size() < 1) {
            wVCallBackContext.error(htw.a("-1", "noSuchTab"));
        } else {
            String string = jSONObject.getString("targetTab");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error(htw.a("-1", "noSuchTab"));
            } else {
                ((ILCTabSwitcher) kdp.a(ILCTabSwitcher.class, new Object[0])).switchTargetTab(this.mContext, string, new ILCTabSwitcher.OnSwitchResult(this) { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.umipublish.extension.windvane.ILCTabSwitcher.OnSwitchResult
                    public void onFail() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cd42bfa4", new Object[]{this});
                        } else {
                            wVCallBackContext.error(htw.a("-1", "noSuchTab"));
                        }
                    }

                    @Override // com.taobao.umipublish.extension.windvane.ILCTabSwitcher.OnSwitchResult
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        } else {
                            wVCallBackContext.success();
                        }
                    }
                });
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        final JSONObject parseObject;
        final String str3;
        String str4;
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("className", PLUGIN_NAME);
        hashMap.put("funcName", str);
        new m3v("Page_GGTabs", "gg111.19920601").a(WindvaneCall.TAG, hashMap, true);
        this.mWVCallBackContext = wVCallBackContext;
        if (CLOSE_WEEX_ACTION.equals(str)) {
            return closeWeex();
        }
        if (TextUtils.isEmpty(str2) || (parseObject = JSON.parseObject(str2)) == null) {
            notifyError("参数为空");
            return true;
        }
        if (isNeedCheckRemoteModuleState(str)) {
            if (isTaopaiRemote(this.mContext)) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            String concat = ",taopai_remote=".concat(str4);
            if (str != null) {
                sb = new StringBuilder("wv: action=");
                sb.append(str);
                sb.append(",");
            } else {
                sb = new StringBuilder("wv:");
            }
            sb.append(concat);
            RemoteEnvUtil.c(sb.toString(), true);
        }
        odg.d(TAG, "UmiWvPlugin.execute: action=" + str);
        if (WVCallRegister.INSTANCE.b(str, parseObject, this.mContext, wVCallBackContext)) {
            return true;
        }
        if (OPEN_RECORD_ACTION.equals(str)) {
            if (muu.w(this.mContext)) {
                InnerOpenRecordAbility innerOpenRecordAbility = new InnerOpenRecordAbility();
                innerOpenRecordAbility.setContext(this.mContext);
                innerOpenRecordAbility.setListener(new WVListener(this.mWVCallBackContext));
                innerOpenRecordAbility.execute(parseObject);
            } else {
                autoFillConfig(this.mContext, parseObject, new vdv<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: b */
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("627b648c", new Object[]{this, jSONObject});
                        } else if (jSONObject != null) {
                            UmiWvPlugin.access$000(UmiWvPlugin.this, jSONObject);
                        }
                    }
                });
            }
            return true;
        } else if (OPEN_PUBLISH_ACTION.equals(str)) {
            if (muu.w(this.mContext)) {
                InnerOpenPublishAbility innerOpenPublishAbility = new InnerOpenPublishAbility();
                innerOpenPublishAbility.setContext(this.mContext);
                innerOpenPublishAbility.setListener(new WVListener(this.mWVCallBackContext));
                innerOpenPublishAbility.execute(parseObject);
            } else {
                filterInnerOpenParamsIfHave(parseObject);
                autoFillConfig(this.mContext, parseObject, new vdv<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: b */
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("627b648c", new Object[]{this, jSONObject});
                        } else if (jSONObject != null) {
                            UmiWvPlugin.access$100(UmiWvPlugin.this, jSONObject, wVCallBackContext);
                        }
                    }
                });
            }
            return true;
        } else if (OPEN_WEEX_PAGE_ACTION.equals(str)) {
            OpenWeexPageAbility openWeexPageAbility = new OpenWeexPageAbility();
            openWeexPageAbility.setContext(this.mContext);
            openWeexPageAbility.setListener(new WVListener(this.mWVCallBackContext));
            openWeexPageAbility.execute(parseObject);
            return true;
        } else if ("prepare".equals(str)) {
            return prepare();
        } else {
            if (LE_VERSION_ACTION.equals(str) || MATERIAL_SDK_VERSION.equals(str)) {
                nsw nswVar = new nsw();
                nswVar.b("version", String.valueOf(fkg.LE_VERSION));
                wVCallBackContext.success(nswVar);
                return true;
            } else if (GET_VIDEO_AND_PHOTO_BIZ_CODE.equals(str)) {
                return getVideoAndPhotoBizCode(parseObject);
            } else {
                if (FETCH_DRAFT_LIST.equals(str)) {
                    return fetchDraftList(parseObject);
                }
                if (OPEN_DRAFT.equals(str)) {
                    return openDraft(parseObject);
                }
                if (DELETE_DRAFTS.equals(str)) {
                    return deleteDraft(parseObject);
                }
                if ("requestLocationPermission".equals(str)) {
                    requestLocationPermission(parseObject);
                    return true;
                } else if (CAN_PRELOAD_PARAMS.equals(str)) {
                    canPreloadParams();
                    return true;
                } else if (QUERY_LAST_PUBLISH_TIME.equals(str)) {
                    getLastPublishTime();
                    return true;
                } else if (READ_LOCAL_IMAGE.equals(str)) {
                    return readLocalImage(parseObject);
                } else {
                    if (OPEN_ALBUM_FILM_ACTION.equals(str)) {
                        Context application = Globals.getApplication();
                        if (application == null) {
                            application = this.mContext;
                        }
                        RemoteEnvUtil.a(application, "guangguang", new RemoteEnvUtil.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                            public void a(String str5, String str6) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c4e0fc68", new Object[]{this, str5, str6});
                                }
                            }

                            @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                            public void b() {
                                String str5;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("fbd923b9", new Object[]{this});
                                } else if (muu.w(UmiWvPlugin.access$200(UmiWvPlugin.this))) {
                                    InnerOpenAlbumFilmAbility innerOpenAlbumFilmAbility = new InnerOpenAlbumFilmAbility();
                                    innerOpenAlbumFilmAbility.setContext(UmiWvPlugin.access$300(UmiWvPlugin.this));
                                    innerOpenAlbumFilmAbility.setListener(new WVListener(UmiWvPlugin.access$400(UmiWvPlugin.this)));
                                    innerOpenAlbumFilmAbility.execute(parseObject);
                                } else {
                                    boolean isXgcDegrade = UmiWvPlugin.isXgcDegrade(parseObject.getString("biz_scene"));
                                    JSONObject jSONObject = parseObject;
                                    if (isXgcDegrade) {
                                        str5 = "0";
                                    } else {
                                        str5 = "1";
                                    }
                                    jSONObject.put("xgc", (Object) str5);
                                    final IAlbumFilmBridge iAlbumFilmBridge = (IAlbumFilmBridge) kdp.a(IAlbumFilmBridge.class, new Object[0]);
                                    if (iAlbumFilmBridge != null) {
                                        UmiWvPlugin umiWvPlugin = UmiWvPlugin.this;
                                        UmiWvPlugin.access$700(umiWvPlugin, UmiWvPlugin.access$500(umiWvPlugin), parseObject, new vdv<JSONObject>() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.3.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            /* renamed from: b */
                                            public void a(JSONObject jSONObject2) {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("627b648c", new Object[]{this, jSONObject2});
                                                } else if (jSONObject2 != null) {
                                                    iAlbumFilmBridge.open(UmiWvPlugin.access$600(UmiWvPlugin.this), jSONObject2, wVCallBackContext);
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        });
                        return true;
                    } else if (GET_PUBLISH_CONFIG_V2.equals(str)) {
                        try {
                            nsw nswVar2 = new nsw();
                            nswVar2.j("HY_SUCCESS");
                            nswVar2.h(new org.json.JSONObject(dov.b(muu.j(this.mContext)).o()));
                            wVCallBackContext.success(nswVar2);
                        } catch (Exception e) {
                            nsw nswVar3 = new nsw();
                            nswVar3.j("HY_FAILED");
                            nswVar3.b("errorCode", "1000");
                            nswVar3.b("message", "获取发布器参数错误，" + e.getMessage());
                            wVCallBackContext.error(nswVar3);
                        }
                        return true;
                    } else if (GET_PUBLISH_CONFIG.equals(str)) {
                        new PublishConfigManager().g(this.mContext, parseObject, new vdv<String>(this) { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* renamed from: b */
                            public void a(String str5) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("12157bae", new Object[]{this, str5});
                                } else {
                                    wVCallBackContext.success(str5);
                                }
                            }
                        });
                        return true;
                    } else if (GET_REMOTE_MODULE_SWITCH.equals(str)) {
                        getRemoteModuleSwitch(this.mContext, parseObject);
                        return true;
                    } else if (SAVE_IMAGE.equals(str)) {
                        saveImage(this.mContext, parseObject, wVCallBackContext);
                        return true;
                    } else if (CLOSE_LC_PAGE.equals(str)) {
                        handleClosePage(parseObject, wVCallBackContext);
                        return true;
                    } else if (SWITCH_TAB.equals(str)) {
                        switchTab(parseObject, wVCallBackContext);
                        return true;
                    } else if (QUICK_PREVIEW.equals(str)) {
                        if (checkFastClick()) {
                            return true;
                        }
                        boolean w = muu.w(this.mContext);
                        odg.c(TAG, "execute:QUICK_PREVIEW innerPublishMode=" + w);
                        if (w) {
                            str3 = "tab.inspiration";
                        } else {
                            str3 = "activity";
                        }
                        UmiPublishMonitor.w().g(str3, "preview_button_click", parseObject);
                        QuickPreviewAbility quickPreviewAbility = new QuickPreviewAbility();
                        quickPreviewAbility.setContext(this.mContext);
                        quickPreviewAbility.setListener(new WVListener(this, this.mWVCallBackContext) { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass5 r4, String str5, Object... objArr) {
                                int hashCode = str5.hashCode();
                                if (hashCode == -1744762715) {
                                    super.onSuccess((JSONObject) objArr[0]);
                                    return null;
                                } else if (hashCode == -343211753) {
                                    super.a((String) objArr[0], (String) objArr[1]);
                                    return null;
                                } else {
                                    int hashCode2 = str5.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode2 + " in com/taobao/umipublish/extension/windvane/UmiWvPlugin$5");
                                }
                            }

                            @Override // com.taobao.umipublish.extension.windvane.abilities.WVListener, com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                            public void a(String str5, String str6) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("eb8b0117", new Object[]{this, str5, str6});
                                    return;
                                }
                                super.a(str5, str6);
                                odg.c(UmiWvPlugin.TAG, "onFailed: " + str5 + str6);
                                if (TextUtils.equals(str5, PreRequestPresenter.SOURCE_RATE_HISTORY)) {
                                    UmiPublishMonitor.w().g(str3, "preview_cancel_by_user", parseObject);
                                } else {
                                    UmiPublishMonitor.w().d(str3, str5, str6, "quick_preview_error", parseObject.toJSONString());
                                }
                            }

                            @Override // com.taobao.umipublish.extension.windvane.abilities.WVListener, com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
                            public void onSuccess(JSONObject jSONObject) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                                    return;
                                }
                                super.onSuccess(jSONObject);
                                odg.d(UmiWvPlugin.TAG, "onSuccess: openQuickPreview ");
                            }
                        });
                        quickPreviewAbility.execute(parseObject);
                        return true;
                    } else if (TextUtils.equals(str, OPEN_NEW_WINDOW_ACTION)) {
                        openNewWebWindow(this.mContext, parseObject);
                        return true;
                    } else if (TextUtils.equals(str, IMAGE_CUTOUT_STROKE)) {
                        ImageStokeAbility imageStokeAbility = new ImageStokeAbility();
                        imageStokeAbility.setContext(getContext());
                        imageStokeAbility.setListener(new WVListener(this.mWVCallBackContext));
                        imageStokeAbility.execute(parseObject);
                        return true;
                    } else if (TextUtils.equals(str, "shareContentToGG")) {
                        Context application2 = Globals.getApplication();
                        if (application2 == null) {
                            application2 = this.mContext;
                        }
                        RemoteEnvUtil.a(application2, "guangguang", new RemoteEnvUtil.a() { // from class: com.taobao.umipublish.extension.windvane.UmiWvPlugin.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                            public void a(String str5, String str6) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c4e0fc68", new Object[]{this, str5, str6});
                                }
                            }

                            @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                            public void b() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("fbd923b9", new Object[]{this});
                                } else {
                                    new Share2GGWindvaneCall((FragmentActivity) UmiWvPlugin.access$800(UmiWvPlugin.this), wVCallBackContext).c(parseObject);
                                }
                            }
                        });
                        return true;
                    } else if (!TextUtils.equals(str, OPEN_SIMPLE_RECORD)) {
                        return false;
                    } else {
                        openSimpleRecord(parseObject, wVCallBackContext);
                        return true;
                    }
                }
            }
        }
    }

    private void notifyError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714e6190", new Object[]{this, str});
        } else if (this.mWVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.j("HY_FAILED");
            nswVar.b("message", str);
            nswVar.b("errorCode", PAGE_EXIT);
            this.mWVCallBackContext.error(nswVar);
        }
    }

    private boolean readLocalImage(JSONObject jSONObject) {
        String string;
        int intValue;
        int intValue2;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e21ba427", new Object[]{this, jSONObject})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            string = jSONObject.getString("path");
            intValue = jSONObject.getInteger("width").intValue();
            intValue2 = jSONObject.getInteger("height").intValue();
            string2 = jSONObject.getString("mode");
        } catch (Throwable th) {
            th.printStackTrace();
            nswVar.b("errorCode", "1000");
            this.mWVCallBackContext.error(nswVar);
        }
        if (!(TextUtils.isEmpty(string) || intValue == 0 || intValue2 == 0)) {
            if (!cg9.m(string)) {
                nswVar.b("errorCode", "1001");
                this.mWVCallBackContext.error(nswVar);
                return true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(string);
            if (decodeFile == null) {
                nswVar.b("errorCode", "1002");
                this.mWVCallBackContext.error(nswVar);
                return true;
            }
            Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float width = intValue / decodeFile.getWidth();
            float height = intValue2 / decodeFile.getHeight();
            if ("centerCrop".equals(string2)) {
                width = Math.max(width, height);
            }
            Matrix matrix = new Matrix();
            matrix.postScale(width, width);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            Bitmap createBitmap2 = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            canvas.drawBitmap(createBitmap2, (intValue - createBitmap2.getWidth()) / 2, (intValue2 - createBitmap2.getHeight()) / 2, paint);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            nswVar.b("data", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
            this.mWVCallBackContext.success(nswVar);
            return true;
        }
        nswVar.b("errorCode", "1003");
        this.mWVCallBackContext.error(nswVar);
        return true;
    }
}
