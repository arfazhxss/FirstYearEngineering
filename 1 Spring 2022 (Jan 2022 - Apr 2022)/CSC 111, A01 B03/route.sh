#!/bin/bash

git add . && \
git add -u && \
git commit -m $'Routine Commit Session: '"Committed on $(date)"$'\nby Arfaz' && \
git push origin HEAD
