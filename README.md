# Android-VideoStreamDecodingSample

## Introduction

This sample code demonstrates how to use [FFmpeg](https://ffmpeg.org) for video frame parsing and to use the `MediaCodec` for hardware decoding. It will help to parse video frames and decode the raw video stream data from DJI Camera and output the [YUV](https://en.wikipedia.org/wiki/YUV) data. 

## Requirements

 - Android Studio 2.0+
 - Android System 4.2+
 - DJI Android SDK 4.16.4

## IMPORTANT: Install `git lfs`

This repository uses Git Large File Storage (`git lfs`) for JNI lib storage. Please install `git lfs` from [here](https://github.com/git-lfs/git-lfs/wiki/Installation).

After `git lfs` installation, you can clone or pull just like normal repository.

Click [here](https://github.com/git-lfs/git-lfs/wiki/Tutorial) for more information on `git lfs`.

>NOTE: You CANNOT use **DOWNLOAD** feature because it does not automatically pull from `git lfs`. Please use `git clone`. If you want to clone only latest commit, you can use `--depth 1` option of `git clone`.

## Explanation

For this sample code's explanation, please refer to <https://developer.dji.com/mobile-sdk/documentation/sample-code/index.html>.

## License

Android-VideoStreamDecodingSample is available under the MIT license. Please see the LICENSE file for more info.
