package com.taobao.interact.upload.service;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.upload.service.UploadService;
import java.io.File;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.gf9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FileUploadListenerAdapter implements FileUploadBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long fileBytes;
    private gf9 mFileUploadListener;

    public FileUploadListenerAdapter(gf9 gf9Var, String str) {
        this.mFileUploadListener = gf9Var;
        this.fileBytes = new File(str).length();
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
        long j = this.fileBytes;
        ((UploadService.AnonymousClass1.a) this.mFileUploadListener).c((i * j) / 100, j);
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            ((UploadService.AnonymousClass1.a) this.mFileUploadListener).d();
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
        } else {
            ((UploadService.AnonymousClass1.a) this.mFileUploadListener).a(str, str2, str3);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onFinish(UploadFileInfo uploadFileInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo, str});
        } else {
            ((UploadService.AnonymousClass1.a) this.mFileUploadListener).b(uploadFileInfo, str);
        }
    }
}
