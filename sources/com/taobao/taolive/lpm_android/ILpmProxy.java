package com.taobao.taolive.lpm_android;

import android.content.Context;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taolive.lpm_android.event.EventType;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ILpmProxy extends IBTypeProxy {
    public static final String KEY = "ILpmProxy";

    void addTrace(EventType eventType, String str, JSONObject jSONObject, String str2, String str3);

    void clearContext(String str);

    void destroy();

    void initialize(Context context);

    void onActivate(String str, String str2, String str3, String str4, String str5, String str6);

    void onAsyncINetDataRequest(String str, INetDataObject iNetDataObject);

    void onAsyncINetDataRequestError(String str, int i, INetDataObject iNetDataObject, NetResponse netResponse, Object obj);

    void onAsyncINetDataRequestSuccess(String str, int i, INetDataObject iNetDataObject, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj);

    void onAsyncINetDataRequestSystemError(String str, int i, INetDataObject iNetDataObject, NetResponse netResponse, Object obj);

    void onAsyncRequest(String str, NetRequest netRequest);

    void onAsyncRequestError(String str, int i, NetRequest netRequest, NetResponse netResponse, Object obj);

    void onAsyncRequestSuccess(String str, int i, NetRequest netRequest, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj);

    void onAsyncRequestSystemError(String str, int i, NetRequest netRequest, NetResponse netResponse, Object obj);

    void onAudioFocusChange(String str, IMediaPlayer iMediaPlayer, int i);

    NetRequest onBuildRequest(String str, INetDataObject iNetDataObject);

    void onCompletion(String str, IMediaPlayer iMediaPlayer);

    void onDispatch(String str, TLiveMsg tLiveMsg);

    void onError(String str, IMediaPlayer iMediaPlayer, int i, int i2);

    void onInfo(String str, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);

    void onMessageError(String str, int i, Object obj);

    void onPauseStart(String str, IMediaPlayer iMediaPlayer);

    void onPauseSuccess(String str, IMediaPlayer iMediaPlayer);

    void onPlayStart(String str, IMediaPlayer iMediaPlayer);

    void onPrepareStart(String str, IMediaPlayer iMediaPlayer);

    void onPrepareSuccess(String str, IMediaPlayer iMediaPlayer);

    void onRead(String str, String str2, String str3, String str4, String str5);

    void onSeekComplete(String str, IMediaPlayer iMediaPlayer);

    void onSeekStart(String str, IMediaPlayer iMediaPlayer);

    void onStartSuccess(String str, IMediaPlayer iMediaPlayer);

    void onSubscribe(String str, int i, int i2, String str2, String str3);

    void onSyncRequest(String str, MtopBusiness mtopBusiness, MtopResponse mtopResponse);

    void onSyncRequest(String str, NetRequest netRequest, NetResponse netResponse);

    void onUnSubscribe(String str, int i, int i2, String str2, String str3);

    void pageDisAppear(String str, Object obj);

    void refreshConfig();

    void track4Click(String str, String str2, String str3, Map<String, String> map);

    void track4Show(String str, String str2, String str3, Map<String, String> map);

    void trackCustom(String str, String str2, Integer num, String str3, String str4, String str5, Map<String, String> map);

    void trackCustom(String str, String str2, String str3, Map<String, String> map);

    void trackPage(String str, String str2, Map<String, String> map);

    void updateAppInfo(String str, String str2);

    void updateContext(String str, String str2, Object obj);

    void updatePageName(String str, Object obj, String str2);

    void updatePageProperties(String str, Object obj, Map<String, String> map);
}
