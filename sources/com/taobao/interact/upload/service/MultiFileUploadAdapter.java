package com.taobao.interact.upload.service;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.z8j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MultiFileUploadAdapter implements FileUploadBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiFileUploadAdapter";
    private String errCode;
    private String errMsg;
    private long mBytesTotal;
    private int mCount;
    private List<String> mLocalFiles;
    private z8j mMultiFileUploadListener;
    private boolean started;
    private Object mLockObj = new Object();
    private List<UploadFileInfo> mUploadFileInfos = new ArrayList();
    private List<String> mUrls = new ArrayList();
    private List<String> mErrorFiles = new ArrayList();
    private int mIndex = 0;
    private List<a> mSortBeans = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public UploadFileInfo f10853a;
        public String b;
        public int c;

        public a() {
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15424612", new Object[]{this, aVar})).intValue();
            }
            return this.c - aVar.c;
        }
    }

    public MultiFileUploadAdapter(z8j z8jVar, List<String> list) {
        this.mMultiFileUploadListener = z8jVar;
        this.mLocalFiles = list;
        this.mErrorFiles.addAll(list);
        this.mCount = list.size();
        for (String str : list) {
            this.mBytesTotal += new File(str).length();
        }
    }

    private void notifyCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eda455", new Object[]{this});
        } else if (this.mIndex == this.mCount) {
            this.started = false;
            if (!this.mErrorFiles.isEmpty()) {
                this.mMultiFileUploadListener.onError(this.errCode, this.errMsg, this.mErrorFiles);
                return;
            }
            Collections.sort(this.mSortBeans);
            for (a aVar : this.mSortBeans) {
                this.mUploadFileInfos.add(aVar.f10853a);
                this.mUrls.add(aVar.b);
            }
            this.mMultiFileUploadListener.onFinish(this.mUploadFileInfos, this.mUrls);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    public void onFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99807463", new Object[]{this, str});
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            long j = this.mBytesTotal;
            this.mMultiFileUploadListener.onProgress(((((this.mIndex * 100) + i) / this.mCount) * j) / 100, j);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.started) {
            synchronized (this) {
                try {
                    if (!this.started) {
                        this.mMultiFileUploadListener.onStart();
                        this.started = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this.mLockObj) {
            Log.e(TAG, "errType = " + str + " errCode = " + str2 + "  errMsg = " + str3);
            this.errCode = str2;
            this.errMsg = str3;
            this.mIndex = this.mIndex + 1;
            notifyCallBack();
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onFinish(UploadFileInfo uploadFileInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo, str});
            return;
        }
        synchronized (this.mLockObj) {
            a aVar = new a();
            aVar.f10853a = uploadFileInfo;
            aVar.b = str;
            aVar.c = this.mLocalFiles.indexOf(uploadFileInfo.getFilePath());
            this.mSortBeans.add(aVar);
            this.mErrorFiles.remove(uploadFileInfo.getFilePath());
            this.mIndex++;
            notifyCallBack();
        }
    }
}
