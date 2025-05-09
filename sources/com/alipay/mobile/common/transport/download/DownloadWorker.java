package com.alipay.mobile.common.transport.download;

import android.os.SystemClock;
import android.taobao.windvane.connect.HttpConnector;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.http.HttpException;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.http.ResourceHttpWorker;
import com.alipay.mobile.common.transport.http.ResponseSizeModel;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.DownloadUtils;
import com.alipay.mobile.common.transport.utils.FileUtils;
import com.alipay.mobile.common.transport.utils.GtsUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DownloadWorker extends ResourceHttpWorker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> E = Collections.synchronizedSet(new HashSet());
    public final DownloadRequest A;
    public int B = 0;
    public final int C;
    public final long D;
    public final SimpleDateFormat x;
    public final File y;
    public final File z;

    public DownloadWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        super(httpManager, httpUrlRequest);
        this.C = 3;
        this.D = System.currentTimeMillis();
        DownloadRequest downloadRequest = (DownloadRequest) httpUrlRequest;
        this.A = downloadRequest;
        this.y = new File(downloadRequest.getPath());
        this.z = DownloadUtils.createCacheFile(this.mContext, downloadRequest);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        this.x = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.mTransportContext.bizType = (byte) 4;
        this.D = System.currentTimeMillis();
        if (NetworkUtils.isWiFiMobileNetwork(TransportEnvUtil.getContext())) {
            this.C = 10;
        }
    }

    public static /* synthetic */ Object ipc$super(DownloadWorker downloadWorker, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1683269076:
                super.preCheck();
                return null;
            case -755776379:
                return new Boolean(super.canRetryCurrTaskForSubBiz((Throwable) objArr[0]));
            case 903213326:
                return super.executeHttpClientRequest((HttpHost) objArr[0], (HttpRequest) objArr[1], (HttpContext) objArr[2]);
            case 947624497:
                return super.getHeaders();
            case 1447423576:
                super.copyHeaders();
                return null;
            case 1540698611:
                super.finallyProcess();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/download/DownloadWorker");
        }
    }

    public final HttpResponse W(HttpUriRequest httpUriRequest, HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("6369e278", new Object[]{this, httpUriRequest, httpResponse});
        }
        if (DownloadUtils.isNeedToDowngradeToHttps(httpUriRequest, httpResponse)) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                entity.consumeContent();
            }
            LogCatUtil.debug("DownloadWorker", "processDowngrade,net hijack,try https");
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.IMGDOWNGRADE, "T");
            HttpUrlRequest originRequest = getOriginRequest();
            AndroidHttpClient httpClient = getHttpClient();
            if (!httpUriRequest.isAborted()) {
                abort();
            }
            return DownloadUtils.executeDowngradeRequest(httpUriRequest, originRequest, httpClient, this.mLocalContext);
        }
        LogCatUtil.debug("DownloadWorker", "handleResponseForDowngrade,needn't downgrade to https");
        return httpResponse;
    }

    public final void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i >= 400 && i < 500) {
            if (!this.A.isAllowRetryForErrorHttpStatusCode() || !TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.NO_RETRY_FOR_IG_HTTP_ST, UTConstant.Args.UT_SUCCESS_F)) {
                String str = "download failed! illegal http status code=" + i;
                LogCatUtil.warn("DownloadWorker", "[handleIllegalResCode] " + str);
                throw new HttpException((Integer) 52, str);
            }
        }
    }

    public final void Z(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.mHttpManager.addSocketTime(System.currentTimeMillis() - System.currentTimeMillis());
        long length = this.z.length();
        LogCatUtil.info("DownloadWorker", "Writed cache file length = " + length);
        this.mHttpManager.addDataSize(this.z.length() - j);
    }

    public final void a0(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
        } else if (!i0()) {
            LogCatUtil.debug("DownloadWorker", "checkIfCanRetry,downerrRetry switch is off");
            throw exc;
        } else if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
            LogCatUtil.debug("DownloadWorker", "network isn't available,don't retry");
            throw exc;
        } else if (!canRetryException(exc)) {
            LogCatUtil.debug("DownloadWorker", "canRetryException return false");
            throw exc;
        } else if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOAD_EXT_TIMEOUT), "T")) {
            long currentTimeMillis = System.currentTimeMillis() - this.D;
            int i = this.B;
            if (i >= this.C || (i > 3 && currentTimeMillis > 60000)) {
                LogCatUtil.debug("DownloadWorker", "already retry many times,throw ex,retryCount:" + this.B + ",taskStalled:" + currentTimeMillis);
                throw exc;
            }
        } else if (this.B > 3) {
            LogCatUtil.debug("DownloadWorker", "already retry many times,throw ex,retryCount:" + this.B);
            throw exc;
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void addRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7457f", new Object[]{this});
            return;
        }
        super.copyHeaders();
        addCookie2Header();
        String alipayLocaleDes = DeviceInfoUtil.getAlipayLocaleDes();
        if (!TextUtils.isEmpty(alipayLocaleDes)) {
            getTargetHttpUriRequest().addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, alipayLocaleDes);
        }
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(getTargetHttpUriRequest());
        AndroidHttpClient.modifyRequestToKeepAlive(getTargetHttpUriRequest());
        printHeaderLog(getTargetHttpUriRequest().getAllHeaders());
    }

    public final void b0(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        long j3 = j2 - j;
        if (!FileUtils.checkDataAvailableSpace(this.z, j3)) {
            String absolutePath = this.z.getAbsolutePath();
            throw new DownloadFileIOException(14, str, absolutePath, "cache space less than " + j3);
        } else if (FileUtils.checkFileDirWRPermissions(this.z)) {
            h0(str, j2);
            if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWN_CHECK_SD_PERMISSION), "T") && !this.y.getParentFile().canWrite()) {
                throw new DownloadIOException(21, str, this.y.getAbsolutePath(), "sdcard write fail");
            } else if (E.contains(str)) {
                throw new DownloadIOException(19, str, this.y.getAbsolutePath(), "downloadFileBlackSet contains this url");
            }
        } else {
            throw new DownloadFileIOException(17, str, this.z.getAbsolutePath(), "cache dir create fail");
        }
    }

    @Override // com.alipay.mobile.common.transport.http.ResourceHttpWorker, com.alipay.mobile.common.transport.http.HttpWorker
    public boolean canRetryCurrTaskForSubBiz(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f3c485", new Object[]{this, th})).booleanValue();
        }
        if (!canRetryException(th)) {
            return false;
        }
        return super.canRetryCurrTaskForSubBiz(th);
    }

    public boolean canRetryException(Throwable th) {
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb2933b", new Object[]{this, th})).booleanValue();
        }
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            if (httpException.getCode() == 429 || httpException.getCode() == 52) {
                return false;
            }
            if (!httpException.isCanRetry()) {
                LogCatUtil.debug("DownloadWorker", "[canRetryException] HttpException can't retry.");
                return false;
            }
        }
        if ((th instanceof DownloadIOException) || (th instanceof DownloadFileIOException)) {
            int code = ((HttpException) th).getCode();
            if (code == 14 || code == 15 || code == 17 || code == 18 || code == 19) {
                LogCatUtil.debug("DownloadWorker", "errorcode=" + code + ",don't retry");
                return false;
            } else if (!NetworkUtils.isWiFiMobileNetwork(this.mContext) && (code == 16 || code == 20)) {
                LogCatUtil.debug("DownloadWorker", "errorcode=" + code + ",don't retry");
                return false;
            }
        }
        try {
            rootCause = MiscUtils.getRootCause(th);
        } catch (Throwable th2) {
            LogCatUtil.error("DownloadWorker", th2);
        }
        if (rootCause != null && isRetryException(rootCause)) {
            return true;
        }
        if (rootCause == null) {
            if (isRetryException(th)) {
                return true;
            }
        }
        return false;
    }

    public final void d0(ArrayList<Header> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        try {
            String str = "download_" + HttpContextExtend.getInstance().getDid() + "_" + GtsUtils.get64HexCurrentTimeMillis();
            arrayList.add(new BasicHeader(HttpConstant.USER_AGENT, "pid=" + AppInfoUtil.getProductId() + "; pv=" + AppInfoUtil.getProductVersion() + "; uuid=" + str));
            this.mTransportContext.rpcUUID = str;
            if (this.y.exists()) {
                if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RSRC_WITH_CACHE), "T")) {
                    long lastModified = this.y.lastModified();
                    if (lastModified > 0) {
                        String format = this.x.format(Long.valueOf(lastModified));
                        arrayList.add(new BasicHeader(HttpConnector.IF_MODIFY_SINCE, format));
                        LogCatUtil.debug("DownloadWorker", "If-Modified-Since:" + format);
                    }
                }
            } else if (this.z.exists()) {
                long length = this.z.length();
                long lastModified2 = this.z.lastModified();
                if (length > 0 && lastModified2 > 0) {
                    arrayList.add(new BasicHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + length + "-"));
                    StringBuilder sb = new StringBuilder("Range:");
                    sb.append(length);
                    LogCatUtil.debug("DownloadWorker", sb.toString());
                    String format2 = this.x.format(Long.valueOf(lastModified2));
                    arrayList.add(new BasicHeader("If-Range", format2));
                    LogCatUtil.debug("DownloadWorker", "If-Range:" + format2);
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("DownloadWorker", th);
        }
    }

    public final void e0(HttpResponse httpResponse, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835a75d4", new Object[]{this, httpResponse, file});
            return;
        }
        try {
            Header firstHeader = httpResponse.getFirstHeader("Last-Modified");
            if (file.exists() && firstHeader != null && !file.setLastModified(AndroidHttpClient.parseDate(firstHeader.getValue()))) {
                LogCatUtil.error("DownloadWorker", "setLastModified error");
            }
        } catch (Exception e) {
            LogCatUtil.warn("DownloadWorker", "proc get Last-Modifie exception : " + e.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpResponse executeHttpClientRequest(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("35d5f10e", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
        if (!DownloadUtils.isNeedToDowngradeToHttps(httpUriRequest)) {
            return super.executeHttpClientRequest(httpHost, httpRequest, httpContext);
        }
        return W(httpUriRequest, getHttpClient().execute(httpHost, httpRequest, httpContext));
    }

    public final void f0(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d512bfe", new Object[]{this, httpUriRequest});
            return;
        }
        httpUriRequest.removeHeaders(HttpConstant.RANGE);
        httpUriRequest.removeHeaders("If-Range");
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RSRC_RETRY_WITH_RANGE), "T") && this.z.exists()) {
            long length = this.z.length();
            long lastModified = this.z.lastModified();
            if (length > 0 && lastModified > 0) {
                httpUriRequest.setHeader(new BasicHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + length + "-"));
                String format = this.x.format(Long.valueOf(lastModified));
                httpUriRequest.setHeader(new BasicHeader("If-Range", format));
                LogCatUtil.debug("DownloadWorker", "Range:" + length + ",If-Range:" + format);
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void finallyProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd531f3", new Object[]{this});
            return;
        }
        super.finallyProcess();
        if (this.A.isOnlyWifiRequest()) {
            DownloadConnChangedListener.getInstance().removeNetworkSensitiveTask(this.A);
        }
    }

    public final boolean g0(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        boolean equalsString = TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.COPY_FILE_BY_FILECHANNL, "T");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (int i = 0; i < 3 && !z; i++) {
            if (equalsString) {
                try {
                    z = FileUtils.copyFileEnhanced(this.z, this.y);
                } catch (Throwable th) {
                    DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.CP_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    throw th;
                }
            } else {
                z = FileUtils.streamCopyFile(this.z, this.y);
            }
            if (!z) {
                h0(str, j);
            }
        }
        DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.CP_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        return z;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public String getBodyContent(HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6acd167c", new Object[]{this, httpUrlResponse});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this});
        }
        ArrayList<Header> arrayList = new ArrayList<>(super.getHeaders());
        if (this.A.isRedownload()) {
            return arrayList;
        }
        d0(arrayList);
        return arrayList;
    }

    public final void h0(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        } else if (!FileUtils.checkFileDirWRPermissions(this.y)) {
            throw new DownloadFileIOException(18, str, this.y.getAbsolutePath(), "targe dir create fail");
        } else if (!FileUtils.checkDataOrSdcardAvailableSpace(this.y, j)) {
            String absolutePath = this.y.getAbsolutePath();
            throw new DownloadFileIOException(15, str, absolutePath, "target space less than " + j);
        }
    }

    public final boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOADERR_RETRY))) {
            return false;
        }
        return true;
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogCatUtil.debug("DownloadWorker", "deleteAllFile");
        try {
            if (this.y.exists()) {
                boolean delete = this.y.delete();
                LogCatUtil.debug("DownloadWorker", "deletePathFile=" + delete);
            }
            if (this.z.exists()) {
                boolean delete2 = this.z.delete();
                LogCatUtil.debug("DownloadWorker", "deleteCacheFile=" + delete2);
            }
        } catch (Exception e) {
            LogCatUtil.warn("DownloadWorker", e);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void preCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bab5a2c", new Object[]{this});
            return;
        }
        super.preCheck();
        X();
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public boolean willHandleOtherCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd5a0127", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 206 || i == 416 || i == 304) {
            return true;
        }
        return false;
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.A.isOnlyWifiRequest()) {
            if (NetworkUtils.isWiFiMobileNetwork(TransportEnvUtil.getContext())) {
                DownloadConnChangedListener.getInstance().addNetworkSensitiveTask(this.A);
            } else {
                TransportStrategy.fillCurrentReqInfo(true, "https", this.mTransportContext);
                throw new HttpException((Integer) 13, TransportConstants.ERR_MSG_ILLEGAL_NETWORK_TYPE);
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("b5f0373c", new Object[]{this, httpResponse, httpUrlRequest});
        }
        try {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
            long contentLength = httpResponse.getEntity() != null ? httpResponse.getEntity().getContentLength() : -1L;
            LogCatUtil.debug("DownloadWorker", "Url: " + httpUrlRequest.getUrl() + " resCode:" + statusCode + ",contentLength:" + contentLength);
            return handleResponse(httpUrlRequest, httpResponse, statusCode, reasonPhrase);
        } catch (Exception e) {
            LogCatUtil.error("DownloadWorker", "processResponse,exception:" + e.toString());
            consumeContent(httpResponse);
            if (!httpUrlRequest.getHttpUriRequest().isAborted()) {
                abort();
            }
            if (httpResponse != null) {
                printHeaderLog(httpResponse.getAllHeaders());
            }
            a0(e);
            if (!httpUrlRequest.isCanceled()) {
                LogCatUtil.debug("DownloadWorker", "DOWNLOADERR_RETRY switch is on,retryCount=" + this.B);
                this.B = this.B + 1;
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "RETRY", "T");
                DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.RETRYCOUNT, String.valueOf(this.B));
                HttpUriRequest constructHttpUriRequestWithURI = DownloadUtils.constructHttpUriRequestWithURI(httpUrlRequest.getHttpUriRequest().getURI(), httpUrlRequest.getHttpUriRequest(), httpUrlRequest, getHttpClient());
                f0(constructHttpUriRequestWithURI);
                httpUrlRequest.setHttpUriRequest(constructHttpUriRequestWithURI);
                printHeaderLog(constructHttpUriRequestWithURI.getAllHeaders());
                return processResponse(executeHttpClientRequest(((HttpRoute) constructHttpUriRequestWithURI.getParams().getParameter("http.route.forced-route")).getTargetHost(), httpUrlRequest.getHttpUriRequest(), this.mLocalContext), httpUrlRequest);
            }
            LogCatUtil.debug("DownloadWorker", "request is canceled,can't retry");
            throw e;
        }
    }

    public final void c0(String str, long j, long j2, Header header, ResponseSizeModel responseSizeModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8770e52a", new Object[]{this, str, new Long(j), new Long(j2), header, responseSizeModel});
            return;
        }
        if (header == null || TextUtils.isEmpty(header.getValue()) || !header.getValue().contains("gzip")) {
            z = false;
        } else {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.DWN_GZIP, "T");
        }
        String str2 = "contentLength[" + j + "] isUseGzip[" + z + "] compressedSize[" + responseSizeModel.compressedSize + "] rawSize[" + responseSizeModel.rawSize + "] cacheFile.length[" + this.z.length() + "]";
        LogCatUtil.debug("DownloadWorker", str2);
        if (j > 0) {
            if (this.z.length() > 0) {
                String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOAD_GZIP_CHECK);
                if (!TextUtils.equals(stringValue, "T") || !z) {
                    if (TextUtils.equals(stringValue, "T") || !z) {
                        long length = this.z.length() - j2;
                        int i = (length > j ? 1 : (length == j ? 0 : -1));
                        if (i != 0) {
                            String str3 = str2 + ",currentReadedLen:" + length + "，not equal contentLength:" + j;
                            if (i < 0) {
                                throw new DownloadIOException(22, str, this.z.getAbsolutePath(), str3);
                            }
                            return;
                        }
                        return;
                    }
                    LogCatUtil.debug("DownloadWorker", "gzip check is off");
                } else if (responseSizeModel.compressedSize != j) {
                    throw new DownloadIOException(22, str, this.z.getAbsolutePath(), str2 + ",compressedSize not equal contentLength");
                }
            } else {
                throw new DownloadIOException(20, str, this.z.getAbsolutePath(), str2 + ",cache was cleaned");
            }
        }
    }

    public boolean isRetryException(Throwable th) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f92614a1", new Object[]{this, th})).booleanValue();
        }
        if (!(th instanceof SocketException) && !(th instanceof SSLException) && !(th instanceof SocketTimeoutException) && !(th instanceof ConnectionPoolTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof NoHttpResponseException) && !(th instanceof ClientProtocolException) && !(th instanceof DownloadIOException)) {
            z = false;
        }
        LogCatUtil.debug("DownloadWorker", "isRetryException,exception=" + th.toString() + ",canRetry=" + z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0276 A[Catch: all -> 0x023c, TryCatch #6 {all -> 0x023c, blocks: (B:84:0x0230, B:86:0x0238, B:89:0x023e, B:91:0x0246, B:92:0x024b, B:94:0x0257, B:96:0x025b, B:97:0x025d, B:98:0x025e, B:99:0x0275, B:100:0x0276, B:101:0x028d), top: B:128:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0238 A[Catch: all -> 0x023c, TryCatch #6 {all -> 0x023c, blocks: (B:84:0x0230, B:86:0x0238, B:89:0x023e, B:91:0x0246, B:92:0x024b, B:94:0x0257, B:96:0x025b, B:97:0x025d, B:98:0x025e, B:99:0x0275, B:100:0x0276, B:101:0x028d), top: B:128:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023e A[Catch: all -> 0x023c, TryCatch #6 {all -> 0x023c, blocks: (B:84:0x0230, B:86:0x0238, B:89:0x023e, B:91:0x0246, B:92:0x024b, B:94:0x0257, B:96:0x025b, B:97:0x025d, B:98:0x025e, B:99:0x0275, B:100:0x0276, B:101:0x028d), top: B:128:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257 A[Catch: all -> 0x023c, TryCatch #6 {all -> 0x023c, blocks: (B:84:0x0230, B:86:0x0238, B:89:0x023e, B:91:0x0246, B:92:0x024b, B:94:0x0257, B:96:0x025b, B:97:0x025d, B:98:0x025e, B:99:0x0275, B:100:0x0276, B:101:0x028d), top: B:128:0x0230 }] */
    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.mobile.common.transport.Response handleResponse(com.alipay.mobile.common.transport.http.HttpUrlRequest r26, org.apache.http.HttpResponse r27, int r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.download.DownloadWorker.handleResponse(com.alipay.mobile.common.transport.http.HttpUrlRequest, org.apache.http.HttpResponse, int, java.lang.String):com.alipay.mobile.common.transport.Response");
    }
}
