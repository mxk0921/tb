package com.taobao.social.sdk.net;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.model.CountAndStatusRequest;
import com.taobao.social.sdk.model.LikeAddRequest;
import com.taobao.social.sdk.model.LikeRemoveRequest;
import com.taobao.social.sdk.model.ReportRequest;
import com.taobao.social.sdk.net.ISocialService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TBSoundPlayer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.p2o;
import tb.t2o;
import tb.uog;
import tb.vog;
import tb.vyv;
import tb.wu4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SocialServiceImpl implements ISocialService, IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static WeakReference<Activity> currentActivity = new WeakReference<>(null);
    private a mService = new a();

    static {
        t2o.a(817889346);
        t2o.a(817889342);
        t2o.a(589299719);
    }

    private RemoteBusiness createRemoteBusiness(MtopRequest mtopRequest, ISocialBusinessListener<?> iSocialBusinessListener, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("50dcf7fe", new Object[]{this, mtopRequest, iSocialBusinessListener, hashMap});
        }
        return this.mService.createRemoteBusiness(mtopRequest, iSocialBusinessListener, hashMap);
    }

    private int getBusinessId(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e4ed30b", new Object[]{this, remoteBusiness})).intValue();
        }
        return this.mService.getBusinessId(remoteBusiness);
    }

    private <T> void notifyListener(Object obj, boolean z, MtopResponse mtopResponse, T t, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f70fc9", new Object[]{this, obj, new Boolean(z), mtopResponse, t, str, str2});
        } else {
            this.mService.notifyListener(obj, z, mtopResponse, t, str, str2);
        }
    }

    public static final void updateCurrentActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98bb378", new Object[]{activity});
        } else if (activity != null) {
            currentActivity = new WeakReference<>(activity);
        }
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cdd31ad", new Object[]{this, new Long(j), new Long(j2), str, iSocialBusinessListener})).intValue();
        }
        TBSoundPlayer.getInstance().playScene(5);
        LikeAddRequest likeAddRequest = new LikeAddRequest();
        likeAddRequest.setNamespace(j);
        likeAddRequest.setTargetId(j2);
        likeAddRequest.setOrigin(str);
        RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int getCountAndStatus(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("132f3f12", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map != null) {
            CountAndStatusRequest countAndStatusRequest = new CountAndStatusRequest();
            countAndStatusRequest.dataParams = map;
            RemoteBusiness registeListener = createRemoteBusiness(countAndStatusRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.startRequest(ISocialService.SocialAction.QUERY_COUNT_STATUS.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new NullPointerException("getCountAndStatus failure,getCountAndStatus param is null");
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (i == ISocialService.SocialAction.QUERY_REPORT_NEW.getIntCode()) {
            vyv.c(currentActivity.get(), mtopResponse.getRetMsg());
            notifyListener(obj, false, mtopResponse, null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        } else {
            notifyListener(obj, false, mtopResponse, null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (i == ISocialService.SocialAction.QUERY_LIKE.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_REPORT.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_COUNT_STATUS.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_REPORT_NEW.getIntCode()) {
            if (mtopResponse != null) {
                String optString = mtopResponse.getDataJsonObject().optString("result");
                if (!TextUtils.isEmpty(optString)) {
                    vyv.c(currentActivity.get(), optString);
                } else {
                    vyv.c(currentActivity.get(), "举报成功");
                }
            } else {
                vyv.c(currentActivity.get(), "举报成功");
            }
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            notifyListener(obj, false, mtopResponse, null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int removeLike(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28919a1e", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener})).intValue();
        }
        LikeRemoveRequest likeRemoveRequest = new LikeRemoveRequest();
        likeRemoveRequest.setNamespace(j);
        likeRemoveRequest.setTargetId(j2);
        RemoteBusiness registeListener = createRemoteBusiness(likeRemoveRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6513d45", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener})).intValue();
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.setNamespace(j);
        reportRequest.setTargetId(j2);
        RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT_NEW.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int getCountAndStatus(wu4 wu4Var, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23f4eb7", new Object[]{this, wu4Var, iSocialBusinessListener})).intValue();
        }
        if (wu4Var != null) {
            CountAndStatusRequest countAndStatusRequest = new CountAndStatusRequest();
            String[] strArr = wu4Var.targetIds;
            if (strArr != null) {
                countAndStatusRequest.setTargetIds(strArr);
                countAndStatusRequest.setBrowseNamespace(wu4Var.browseNamespace);
                countAndStatusRequest.setCommentNamespace(wu4Var.commentNamespace);
                countAndStatusRequest.setLikeNamespace(wu4Var.likeNamespace);
                countAndStatusRequest.setDislikeNamespace(wu4Var.dislikeNamespace);
                countAndStatusRequest.setIsLikeCount(wu4Var.isLikeCount);
                countAndStatusRequest.setIsDisLikeCount(wu4Var.isDisLikeCount);
                countAndStatusRequest.setIsLikeStatus(wu4Var.isLikeStatus);
                countAndStatusRequest.setIsDisLikeStatus(wu4Var.isDisLikeStatus);
                RemoteBusiness registeListener = createRemoteBusiness(countAndStatusRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
                registeListener.startRequest(ISocialService.SocialAction.QUERY_COUNT_STATUS.getIntCode(), BaseOutDo.class);
                return getBusinessId(registeListener);
            }
            throw new NullPointerException("getCountAndStatus failure,targetIds is null");
        }
        throw new NullPointerException("getCountAndStatus failure,getCountAndStatus param is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int removeLike(String str, String str2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7f87d8a", new Object[]{this, str, str2, iSocialBusinessListener})).intValue();
        }
        LikeRemoveRequest likeRemoveRequest = new LikeRemoveRequest();
        likeRemoveRequest.setNamespace(str);
        likeRemoveRequest.setTargetId(str2);
        RemoteBusiness registeListener = createRemoteBusiness(likeRemoveRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(long j, long j2, long j3, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45d5df57", new Object[]{this, new Long(j), new Long(j2), new Long(j3), iSocialBusinessListener})).intValue();
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.setNamespace(j);
        reportRequest.setTargetId(j2);
        reportRequest.setTargetOwnerId(j3);
        RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(uog uogVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9008926", new Object[]{this, uogVar, iSocialBusinessListener})).intValue();
        }
        if (uogVar != null) {
            TBSoundPlayer.getInstance().playScene(5);
            LikeAddRequest likeAddRequest = new LikeAddRequest();
            likeAddRequest.setNamespace(uogVar.namespace);
            long j = uogVar.targetId;
            if (j > 0) {
                likeAddRequest.setTargetId(j);
            }
            long j2 = uogVar.targetOwnerId;
            if (j2 > 0) {
                likeAddRequest.setTargetOwnerId(j2);
            }
            if (!TextUtils.isEmpty(uogVar.origin)) {
                likeAddRequest.setOrigin(uogVar.origin);
                if (!TextUtils.isEmpty(uogVar.targetCover)) {
                    likeAddRequest.setTargetCover(uogVar.targetCover);
                }
                if (!TextUtils.isEmpty(uogVar.targetUrl)) {
                    likeAddRequest.setTargetUrl(uogVar.targetUrl);
                }
                if (!TextUtils.isEmpty(uogVar.targetTitle)) {
                    likeAddRequest.setTargetTitle(uogVar.targetTitle);
                }
                RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
                registeListener.useWua();
                registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
                return getBusinessId(registeListener);
            }
            throw new IllegalArgumentException("add like failure,origin is null");
        }
        throw new NullPointerException("add like failure,LikeParams is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int removeLike(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84ec6fbd", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map != null) {
            LikeRemoveRequest likeRemoveRequest = new LikeRemoveRequest();
            likeRemoveRequest.dataParams = map;
            RemoteBusiness registeListener = createRemoteBusiness(likeRemoveRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.useWua();
            registeListener.startRequest(ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new NullPointerException("report failure,ReportParams is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(p2o p2oVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bb46775", new Object[]{this, p2oVar, iSocialBusinessListener})).intValue();
        }
        if (p2oVar != null) {
            ReportRequest reportRequest = new ReportRequest();
            reportRequest.setNamespace(p2oVar.namespace);
            long j = p2oVar.targetId;
            if (j != 0) {
                reportRequest.setTargetId(j);
            }
            long j2 = p2oVar.targetOwnerId;
            if (j2 != 0) {
                reportRequest.setTargetOwnerId(j2);
            }
            long j3 = p2oVar.targetParentId;
            if (j3 != 0) {
                reportRequest.setTargetParentId(j3);
            }
            if (!TextUtils.isEmpty(p2oVar.content)) {
                reportRequest.setContent(p2oVar.content);
            }
            if (!TextUtils.isEmpty(p2oVar.videoUrls)) {
                reportRequest.setPicUrls(p2oVar.videoUrls);
            }
            if (!TextUtils.isEmpty(p2oVar.videoUrls)) {
                reportRequest.setVideoUrls(p2oVar.videoUrls);
            }
            if (!TextUtils.isEmpty(p2oVar.expandAttribute)) {
                reportRequest.setExpandAttribute(p2oVar.expandAttribute);
            }
            RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.useWua();
            registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new NullPointerException("report failure,ReportParams is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(vog vogVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd7ca4fc", new Object[]{this, vogVar, iSocialBusinessListener})).intValue();
        }
        if (vogVar != null) {
            TBSoundPlayer.getInstance().playScene(5);
            LikeAddRequest likeAddRequest = new LikeAddRequest();
            likeAddRequest.setNamespace(vogVar.namespace);
            likeAddRequest.setTargetId(vogVar.targetId);
            if (!TextUtils.isEmpty(vogVar.targetOwnerId)) {
                likeAddRequest.setTargetOwnerId(vogVar.targetOwnerId);
            }
            if (!TextUtils.isEmpty(vogVar.origin)) {
                likeAddRequest.setOrigin(vogVar.origin);
                if (!TextUtils.isEmpty(vogVar.targetCover)) {
                    likeAddRequest.setTargetCover(vogVar.targetCover);
                }
                if (!TextUtils.isEmpty(vogVar.targetUrl)) {
                    likeAddRequest.setTargetUrl(vogVar.targetUrl);
                }
                if (!TextUtils.isEmpty(vogVar.targetTitle)) {
                    likeAddRequest.setTargetTitle(vogVar.targetTitle);
                }
                RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
                registeListener.useWua();
                registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
                return getBusinessId(registeListener);
            }
            throw new IllegalArgumentException("add like failure,origin is null");
        }
        throw new NullPointerException("add like failure,LikeParams is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15b763f6", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map != null) {
            ReportRequest reportRequest = new ReportRequest();
            reportRequest.dataParams = map;
            RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.useWua();
            registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new NullPointerException("report failure,ReportParams is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b7baf04", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map != null) {
            TBSoundPlayer.getInstance().playScene(5);
            LikeAddRequest likeAddRequest = new LikeAddRequest();
            likeAddRequest.dataParams = map;
            RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.useWua();
            registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new NullPointerException("add like failure,LikeParams is null");
    }
}
