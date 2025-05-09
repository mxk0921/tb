package org.webrtc;

import org.webrtc.VideoCapturer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface CapturerObserver extends VideoCapturer.CapturerObserver {
    @Override // org.webrtc.VideoCapturer.CapturerObserver
    void onCapturerStarted(boolean z);

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    void onCapturerStopped();

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    void onFrameCaptured(VideoFrame videoFrame);
}
