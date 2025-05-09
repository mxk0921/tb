package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Db extends Gb<AudioFileRiskSample> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "AudioFileRiskSamplePre";

    public static /* synthetic */ void a(Db db, CcrcService ccrcService, AudioFileRiskSample audioFileRiskSample, File file, FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dee79f1", new Object[]{db, ccrcService, audioFileRiskSample, file, callback});
        } else {
            db.a(ccrcService, audioFileRiskSample, file, callback);
        }
    }

    public static /* synthetic */ Object ipc$super(Db db, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Db");
    }

    public void a(CcrcService ccrcService, AudioFileRiskSample audioFileRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7835c94", new Object[]{this, ccrcService, audioFileRiskSample});
            return;
        }
        String filePath = audioFileRiskSample.getFilePath();
        if (TextUtils.isEmpty(filePath)) {
            if (this.e != null) {
                a(ccrcService, "pcm file path is empty", (String) audioFileRiskSample);
                this.e.onFileDetectFail(audioFileRiskSample.getSampleId(), "pcm file path is empty");
            }
            Logging.e(f, "pcm file path is empty");
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            if (this.e != null) {
                a(ccrcService, "pcm file is not exist: " + filePath, (String) audioFileRiskSample);
                this.e.onFileDetectFail(audioFileRiskSample.getSampleId(), "pcm file is not exist");
            }
            Logging.e(f, "pcm file is not exist");
            return;
        }
        a(new Cb(this, ccrcService, audioFileRiskSample, file));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alibaba.security.ccrc.service.CcrcService r7, com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample r8, java.io.File r9, com.alibaba.security.wukong.model.multi.file.FileRiskSample.Callback r10) {
        /*
            r6 = this;
            java.lang.String r0 = "detect file fail, "
            java.lang.String r1 = "_"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.security.ccrc.service.build.Db.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.String r0 = "127dc437"
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r6
            r3 = 1
            r1[r3] = r7
            r7 = 2
            r1[r7] = r8
            r7 = 3
            r1[r7] = r9
            r7 = 4
            r1[r7] = r10
            r2.ipc$dispatch(r0, r1)
            return
        L_0x0022:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x0082, Exception -> 0x0084
            r3.<init>(r9)     // Catch: all -> 0x0082, Exception -> 0x0084
            int r9 = r6.a(r8)     // Catch: all -> 0x0075, Exception -> 0x0078
            byte[] r9 = new byte[r9]     // Catch: all -> 0x0075, Exception -> 0x0078
        L_0x002e:
            int r2 = r3.read(r9)     // Catch: all -> 0x0075, Exception -> 0x0078
            r4 = -1
            if (r2 == r4) goto L_0x007a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0075, Exception -> 0x0078
            r4.<init>()     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r5 = r8.getSampleId()     // Catch: all -> 0x0075, Exception -> 0x0078
            r4.append(r5)     // Catch: all -> 0x0075, Exception -> 0x0078
            r4.append(r1)     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r5 = r8.type()     // Catch: all -> 0x0075, Exception -> 0x0078
            r4.append(r5)     // Catch: all -> 0x0075, Exception -> 0x0078
            r4.append(r1)     // Catch: all -> 0x0075, Exception -> 0x0078
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x0075, Exception -> 0x0078
            r4.append(r5)     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r4 = r4.toString()     // Catch: all -> 0x0075, Exception -> 0x0078
            com.alibaba.security.wukong.model.meta.AudioSegment r5 = new com.alibaba.security.wukong.model.meta.AudioSegment     // Catch: all -> 0x0075, Exception -> 0x0078
            r5.<init>(r9, r2)     // Catch: all -> 0x0075, Exception -> 0x0078
            com.alibaba.security.wukong.model.AudioSample r2 = new com.alibaba.security.wukong.model.AudioSample     // Catch: all -> 0x0075, Exception -> 0x0078
            r2.<init>(r4, r5)     // Catch: all -> 0x0075, Exception -> 0x0078
            com.alibaba.security.wukong.model.config.AudioSampleConfig r4 = r8.getAudioSampleConfig()     // Catch: all -> 0x0075, Exception -> 0x0078
            r2.setAudioSampleConfig(r4)     // Catch: all -> 0x0075, Exception -> 0x0078
            r6.a(r8, r2)     // Catch: all -> 0x0075, Exception -> 0x0078
            r6.a(r7, r2)     // Catch: all -> 0x0075, Exception -> 0x0078
            goto L_0x002e
        L_0x0075:
            r7 = move-exception
            r2 = r3
            goto L_0x00d1
        L_0x0078:
            r9 = move-exception
            goto L_0x0080
        L_0x007a:
            r3.close()     // Catch: IOException -> 0x007e
            goto L_0x00c7
        L_0x007e:
            r7 = move-exception
            goto L_0x00c4
        L_0x0080:
            r2 = r3
            goto L_0x0085
        L_0x0082:
            r7 = move-exception
            goto L_0x00d1
        L_0x0084:
            r9 = move-exception
        L_0x0085:
            java.lang.String r1 = "AudioFileRiskSamplePre"
            java.lang.String r3 = "detect fail"
            com.alibaba.security.ccrc.common.log.Logging.e(r1, r3, r9)     // Catch: all -> 0x0082
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0082
            r1.<init>()     // Catch: all -> 0x0082
            r1.append(r0)     // Catch: all -> 0x0082
            java.lang.String r3 = android.util.Log.getStackTraceString(r9)     // Catch: all -> 0x0082
            r1.append(r3)     // Catch: all -> 0x0082
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0082
            r6.a(r7, r1, r8)     // Catch: all -> 0x0082
            if (r10 == 0) goto L_0x00be
            java.lang.String r7 = r8.getSampleId()     // Catch: all -> 0x0082
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0082
            r1.<init>()     // Catch: all -> 0x0082
            r1.append(r0)     // Catch: all -> 0x0082
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)     // Catch: all -> 0x0082
            r1.append(r9)     // Catch: all -> 0x0082
            java.lang.String r9 = r1.toString()     // Catch: all -> 0x0082
            r10.onFileDetectFail(r7, r9)     // Catch: all -> 0x0082
        L_0x00be:
            if (r2 == 0) goto L_0x00c7
            r2.close()     // Catch: IOException -> 0x007e
            goto L_0x00c7
        L_0x00c4:
            r7.printStackTrace()
        L_0x00c7:
            if (r10 == 0) goto L_0x00d0
            java.lang.String r7 = r8.getSampleId()
            r10.onFileDetectEnd(r7)
        L_0x00d0:
            return
        L_0x00d1:
            if (r2 == 0) goto L_0x00db
            r2.close()     // Catch: IOException -> 0x00d7
            goto L_0x00db
        L_0x00d7:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00db:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.Db.a(com.alibaba.security.ccrc.service.CcrcService, com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample, java.io.File, com.alibaba.security.wukong.model.multi.file.FileRiskSample$Callback):void");
    }

    private int a(AudioFileRiskSample audioFileRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3bfa8f30", new Object[]{this, audioFileRiskSample})).intValue() : audioFileRiskSample.getAudioSampleConfig().calDetectBuffer(audioFileRiskSample.getOneDetectAudioTime());
    }
}
